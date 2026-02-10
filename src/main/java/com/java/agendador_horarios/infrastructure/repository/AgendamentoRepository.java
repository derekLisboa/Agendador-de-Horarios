package com.java.agendador_horarios.infrastructure.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.agendador_horarios.infrastructure.entity.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{
    
    Agendamento findByServicoAndDataHoraAgendamentoBetween(String servico, LocalDateTime dataHoraInicio,
         LocalDateTime dataHoraFinal);
}
