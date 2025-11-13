package br.com.fiap.gs.GS_2sem.dto;

public class InfoResponse {
    private String tema;
    private String membro1;
    private String descricao;

    public InfoResponse(String tema, String membro1, String descricao) {
        this.tema = tema;
        this.membro1 = membro1;
        this.descricao = descricao;
    }

    public String getTema() {
        return tema;
    }

    public String getMembro1() {
        return membro1;
    }

    public String getDescricao() {
        return descricao;
    }

}
