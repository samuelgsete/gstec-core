package br.com.samuel.app.usesCases.cartao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.samuel.app.models.BandeiraCartaoCredito;

public class ValidadorLuhn {
    public BandeiraCartaoCredito validar(Long numero) {
        Long n = numero;
        List<Integer> numeros = new ArrayList<Integer>();
        Integer index = 0;
        Integer digito = 0;
        Integer somatorio = 0;

        do {
            numeros.add((int) (n % 10));
            if (index % 2 != 0) {
                digito = (int) (n % 10);
                digito = digito * 2;
                if (digito > 9) {
                    Integer d1 = digito % 10;
                    Integer d2 = (digito / 10);
                    somatorio += d1 + d2;
                } else {
                    somatorio += digito;
                }
            } else {
                digito = (int) (n % 10);
                somatorio += digito;
            }
            n = n / 10;
            index++;
        } while (n != 0);

        numeros = numeros.stream().collect(Collectors.toList());
        Collections.reverse(numeros);

        Integer d1 = numeros.get(0);
        Integer d2 = numeros.get(1);
        Integer doisDigitos = Integer.parseInt("" + d1 + "" + d2);

        if (somatorio % 10 == 0) {
            if (d1 == 4) {
                return new BandeiraCartaoCredito("VISA");
            } else if (doisDigitos >= 51 && doisDigitos <= 55) {
                return new BandeiraCartaoCredito("MASTERCARD");
            } else if (doisDigitos == 34 || doisDigitos == 37) {
                return new BandeiraCartaoCredito("AMERICANEXPRESS");
            } else if (doisDigitos == 38 || doisDigitos == 60) {
                return new BandeiraCartaoCredito("HIPERCARD");
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}