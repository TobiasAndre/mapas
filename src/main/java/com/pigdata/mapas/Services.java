package com.pigdata.mapas;

import com.google.gson.Gson;
import com.pigdata.mapas.model.Contorno;
import com.pigdata.mapas.model.Coordenada;
import com.pigdata.mapas.model.Coordenada2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/service")
public class Services {
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public Services(JdbcTemplate mJdbcTemplate){
        this.jdbcTemplate = mJdbcTemplate;
    }

    @RequestMapping("/equipamentos/list")
    public List<Coordenada> equipamentosList(){

        String mSql = " select st_x(posicao),st_y(posicao)" +
                      "   from equipamento ";

        List<Coordenada> coordenadas = jdbcTemplate.query(mSql,
                (rs, rowNums) -> new Coordenada(rs.getDouble(1),rs.getDouble(2)));

        return coordenadas;
    }

    @RequestMapping("/equipamentoscores/list")
    public List<Coordenada2> equipamentosCoresList(){
        String mSql = "select st_x(posicao),st_y(posicao),cor,nome" +
                "  from equipamento inner join cliente on cliente.id = equipamento.cliente_id";

        List<Coordenada2> coordenadas = jdbcTemplate.query(mSql,
                (rs, rowNums) -> new Coordenada2(rs.getDouble(1),rs.getDouble(2),"#"+rs.getString(3),rs.getString(4)));

        return coordenadas;
    }

    @RequestMapping("/gps/list")
    public List<String> gpsList(){
        String sql = " select name,ST_asgeojson(geom) from contorno ";
        List<String> contornosList = jdbcTemplate.query(sql, (rs, i) -> new Gson().toJson(new Contorno(rs.getString(1),rs.getString(2))));
        return contornosList;
    }

    @RequestMapping("/municipio/list")
    public List<String> municipioList(){
        String sql = " select nome,ST_asgeojson(geom) from municipio where geocodigo like ('41%') ";
        List<String> contornosList = jdbcTemplate.query(sql, (rs, i) -> new Gson().toJson(new Contorno(rs.getString(1),rs.getString(2))));
        return contornosList;
    }

}
