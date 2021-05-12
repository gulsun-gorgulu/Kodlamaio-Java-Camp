package kodlamaio.hrms.business.abstracts;


import kodlamaio.hrms.entities.concretes.JobPositions;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface JobPositionsService {
    List<JobPositions> getAll();
}
