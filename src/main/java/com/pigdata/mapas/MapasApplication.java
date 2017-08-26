package com.pigdata.mapas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@SpringBootApplication
public class MapasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapasApplication.class, args);
	}

	@RequestMapping("/mapas/equipamento")
	public ModelAndView mapaEquipamento(){
		ModelAndView mv = new ModelAndView("mapas/MapaEquipamento");

		return mv;
	}

	@RequestMapping("/mapas/equipamentocores")
	public ModelAndView mapaEquipamentoCores(){
		ModelAndView mv = new ModelAndView("mapas/MapaEquipamentoCores");

		return mv;
	}

	@RequestMapping("/mapas/gps")
	public ModelAndView mapaGps(){
		ModelAndView mv = new ModelAndView("mapas/MapaGPS");
		return mv;
	}

	@RequestMapping("/mapas/municipios")
	public ModelAndView municipiosGPS(){
		ModelAndView mv = new ModelAndView("mapas/MapaMunicipio");
		return mv;
	}


}
