package postmat.demo.postmat.repo.MachineRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import postmat.demo.postmat.pojo.Machine;

public interface MachineRepo extends JpaRepository<Machine, Integer> {

}
