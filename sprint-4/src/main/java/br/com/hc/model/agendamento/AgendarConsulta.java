package br.com.hc.model.agendamento;

public class AgendarConsulta {
    private Integer id; // Novo campo ID
    private String paciente;
    private String medico;
    private String dataHora;
    private String motivo;



    public AgendarConsulta() {}


    public AgendarConsulta(Integer id, String paciente, String medico, String dataHora, String motivo) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.motivo = motivo;
    }

    public AgendarConsulta(String paciente, String medico, String dataHora, String motivo) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.motivo = motivo;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getPaciente() { return paciente; }
    public void setPaciente(String paciente) { this.paciente = paciente; }

    public String getMedico() { return medico; }
    public void setMedico(String medico) { this.medico = medico; }

    public String getDataHora() { return dataHora; }
    public void setDataHora(String dataHora) { this.dataHora = dataHora; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
}