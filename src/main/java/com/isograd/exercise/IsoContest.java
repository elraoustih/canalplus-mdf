/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 *  IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 * ***/
package com.isograd.exercise;
import java.util.*;

public class IsoContest {

    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);

        int nbrPlacesEtage = 0;
        int nbrEquipes = 0;
        int nbrCollabotrateurs = 0;
        int line = 0;
        Map<Integer, Integer> compositionsEquipe = new HashMap<Integer, Integer>();
        List<Integer> equipesPlacees = new ArrayList<Integer>();
        while (sc.hasNextLine() && (line == 0 || line < nbrEquipes)) {
            if (nbrPlacesEtage == 0) {
                nbrPlacesEtage = sc.nextInt();
            } else if (nbrEquipes == 0) {
                nbrEquipes = sc.nextInt();
            } else {
                nbrCollabotrateurs = sc.nextInt();
                compositionsEquipe.put(line,nbrCollabotrateurs);
                line++;
            }/* Lisez les données et effectuez votre traitement */
        }
        /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
        int nbrEtagesRemplis = 0;

        for(int i=0; i<nbrEquipes; i++){
            if(!equipesPlacees.contains(i)&& compositionsEquipe.get(i) == nbrPlacesEtage) {
                equipesPlacees.add(i);
                nbrEtagesRemplis++;
            }
        }

        for(int i=0; i<nbrEquipes;i++) {
            int nbrPlacesRestantes = nbrPlacesEtage;
            if(!equipesPlacees.contains(i)&& compositionsEquipe.get(i) < nbrPlacesRestantes) {
                equipesPlacees.add(i);
                nbrPlacesRestantes -= compositionsEquipe.get(i);
                if (nbrPlacesRestantes > 0) {
                    for (int j = 0; j < nbrEquipes; j++) {
                        if (i != j && !equipesPlacees.contains(j) && compositionsEquipe.get(i) + compositionsEquipe.get(j) == nbrPlacesEtage) {
                            equipesPlacees.add(j);
                            nbrEtagesRemplis++;
                            break;
                        }
                    }
                } else {
                    nbrEtagesRemplis++;
                }
            }
        }

        System.out.println(nbrEtagesRemplis);
    }
}