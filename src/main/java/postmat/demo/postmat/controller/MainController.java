package postmat.demo.postmat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import postmat.demo.postmat.pojo.Machine;
import postmat.demo.postmat.service.MachineService;

@RestController
public class MainController {

	@Autowired
	private MachineService machineService;

	@GetMapping("/machines/test/add")
	public ResponseEntity<Void> addTestMachine() {

		Machine m1 = new Machine("Fiat Bravo", "Description1", 5000);
        Machine m2 = new Machine("Ferrari f16", "Description 2", 50000);
        Machine m3 = new Machine("Fiat Punto", "Description 3", 3000);

		machineService.save(m1);
        machineService.save(m2);
        machineService.save(m3);

		return ResponseEntity.ok().build();

	}
	@GetMapping("/machines")
    public ResponseEntity<List<Machine>> getAllMachine() {

        List<Machine> machines = machineService.getAllMachine();

        return ResponseEntity.ok(machines);
    }

}


