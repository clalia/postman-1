package postmat.demo.postmat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import postmat.demo.postmat.pojo.Machine;
import postmat.demo.postmat.repo.MachineRepo.MachineRepo;

@Service
public class MachineService {

    @Autowired
    private MachineRepo machineRepo;

    public void save(Machine machine){
        machineRepo.save(machine);

    }
    public List<Machine> getAllMachine(){
        return machineRepo.findAll();
    }
    public void delete(Machine machine){
        machineRepo.delete(machine);
    }
}
