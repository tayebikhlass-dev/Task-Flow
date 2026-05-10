package outils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Classe utilitaire pour les dates et les formats
 */
public class DateUtils {

    /**
     * Formate une date en chaîne de caractères (JJ/MM/AAAA)
     */
    public static String formaterDate(LocalDate date) {
        if (date == null) return "N/A";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
}
