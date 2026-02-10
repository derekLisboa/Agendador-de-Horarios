package com.java.agendador_horarios.services;

import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.java.agendador_horarios.infrastructure.entity.Agendamento;
import com.java.agendador_horarios.infrastructure.repository.AgendamentoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AgendamentoServices {

    private final AgendamentoRepository agendamentoRepository;

    public Agendamento salvarAgendamento(Agendamento agendamento){

        LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();
        LocalDateTime horaFim = agendamento.getDataHoraAgendamento().plusHours(1);
        
        Agendamento agendados = agendamentoRepository.findByServicoAndDataHoraAgendamentoBetween(agendamento.getServico(),
    horaAgendamento, horaFim);

        if(Objects.nonNull(agendados)){
            throw new RuntimeException("Horário já está preenchido");
        }
            return agendamentoRepository.save(agendamento);
    }
}