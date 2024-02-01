package med.voll.api.model;

import med.voll.api.enuns.Especialidades;

public record MedicoModel(String nome, String email, String crm,
                          Especialidades especialidade, Endereço endereco) { }
