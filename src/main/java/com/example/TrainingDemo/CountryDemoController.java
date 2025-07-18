package com.example.TrainingDemo;

import com.example.TrainingDemo.model.Country;
import com.example.TrainingDemo.model.State;
import com.example.TrainingDemo.model.District;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/country-demo")
public class CountryDemoController {
    @GetMapping("/getCountry")
    public Country getSampleCountry() {
        // Sample Districts
        District district1 = new District("Bangalore Urban", "560001", 10000000L, 5200000L, 4800000L);
        District district2 = new District("Mysore", "570001", 3000000L, 1520000L, 1480000L);
        List<District> karnatakaDistricts = Arrays.asList(district1, district2);

        District district3 = new District("Chennai", "600001", 8000000L, 4000000L, 4000000L);
        District district4 = new District("Coimbatore", "641001", 2000000L, 1000000L, 1000000L);
        List<District> tamilNaduDistricts = Arrays.asList(district3, district4);

        // Sample States
        State state1 = new State("Karnataka", karnatakaDistricts);
        State state2 = new State("Tamil Nadu", tamilNaduDistricts);
        List<State> states = Arrays.asList(state1, state2);

        // Sample Country
        Country india = new Country("India", states);
        return india;
    }

    @GetMapping("/countryMap")
    public Map<String, Country> getCountryHashMap() {
        Map<String, Country> countryMap = new HashMap<>();

        // Sample Districts using Map
        Map<String, District> karnatakaDistrictMap = new HashMap<>();
        karnatakaDistrictMap.put("Bangalore Urban", new District("Bangalore Urban", "560001", 10000000L, 5200000L, 4800000L));
        karnatakaDistrictMap.put("Mysore", new District("Mysore", "570001", 3000000L, 1520000L, 1480000L));

        Map<String, District> tamilNaduDistrictMap = new HashMap<>();
        tamilNaduDistrictMap.put("Chennai", new District("Chennai", "600001", 8000000L, 4000000L, 4000000L));
        tamilNaduDistrictMap.put("Coimbatore", new District("Coimbatore", "641001", 2000000L, 1000000L, 1000000L));

        // Sample States using Map
        Map<String, State> stateMap = new HashMap<>();
        stateMap.put("Karnataka", new State("Karnataka", List.copyOf(karnatakaDistrictMap.values())));
        stateMap.put("Tamil Nadu", new State("Tamil Nadu", List.copyOf(tamilNaduDistrictMap.values())));

        // Sample Country
        Country india = new Country("India", List.copyOf(stateMap.values()));
        countryMap.put("India", india);

        return countryMap;
    }

    @GetMapping("/countryMapNested")
    public Map<String, Map<String, Map<String, District>>> getCountryMapNested() {
        Map<String, Map<String, Map<String, District>>> countryMap = new HashMap<>();

        // Karnataka districts
        Map<String, District> karnatakaDistrictMap = new HashMap<>();
        karnatakaDistrictMap.put("Bangalore Urban", new District("Bangalore Urban", "560001", 10000000L, 5200000L, 4800000L));
        karnatakaDistrictMap.put("Mysore", new District("Mysore", "570001", 3000000L, 1520000L, 1480000L));

        // Tamil Nadu districts
        Map<String, District> tamilNaduDistrictMap = new HashMap<>();
        tamilNaduDistrictMap.put("Chennai", new District("Chennai", "600001", 8000000L, 4000000L, 4000000L));
        tamilNaduDistrictMap.put("Coimbatore", new District("Coimbatore", "641001", 2000000L, 1000000L, 1000000L));

        // States map
        Map<String, Map<String, District>> stateMap = new HashMap<>();
        stateMap.put("Karnataka", karnatakaDistrictMap);
        stateMap.put("Tamil Nadu", tamilNaduDistrictMap);

        // Country map
        countryMap.put("India", stateMap);

        return countryMap;
    }
}
