
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizarddetective;

import byui.cit260.wizardDetective.model.Game;
import byui.cit260.wizardDetective.model.Player;
import byui.cit260.wizardDetective.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carathomson
 */
public class WizardDetective {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        WizardDetective.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        WizardDetective.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        WizardDetective.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        WizardDetective.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        WizardDetective.logFile = logFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            //open character stream files for end user input and output
            WizardDetective.inFile
                    = new BufferedReader(new InputStreamReader(System.in));

            WizardDetective.outFile = new PrintWriter(System.out, true);

            //open log file
            String filePath = "log.txt";
            WizardDetective.logFile = new PrintWriter(filePath);

            StartProgramView startProgramView = new StartProgramView();
            try {
                startProgramView.display();
            } catch (Throwable te) {
                System.out.println(te.getMessage());
                te.printStackTrace();
                startProgramView.display();
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.toString()
                    + "\n Cause: " + e.getCause()
                    + "\n Message: " + e.getMessage());

        } finally {
            try {
                if (WizardDetective.inFile != null) {
                    WizardDetective.inFile.close();
                }

                if (WizardDetective.outFile != null) {
                    WizardDetective.outFile.close();
                }

                if (WizardDetective.logFile != null) {
                    WizardDetective.outFile.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(WizardDetective.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
