package com.carinaBoujonWebProject.application.repository;

import com.carinaBoujonWebProject.application.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface isAdminRepository extends JpaRepository <Admin, Long>{
}
