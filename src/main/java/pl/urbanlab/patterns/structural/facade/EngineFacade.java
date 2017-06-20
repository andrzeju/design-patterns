package pl.urbanlab.patterns.structural.facade;

import pl.urbanlab.patterns.structural.facade.ElectronicModule;

/**
 * Created by andrzej on 20.06.17.
 */
public class EngineFacade {
    ElectronicModule electro = new ElectronicModule();
    DiagnosticModule diagnostics = new DiagnosticModule();
    EngineUnit engineUnit = new EngineUnit();

    public void run() {
        electro.checkElectronicCircuits();
        diagnostics.runTests();
        engineUnit.start();
    }
}
