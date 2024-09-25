package com.emadesko.views;

import java.util.List;

public interface View {
    int choixSousMenu(String menuTxt, int valueSup);

    String obligatoire(String menuTxt, String errorTxt);

    <T> void showListElements(List<T> list, String entity);

    int menu();

    <T> T saisie();
}
