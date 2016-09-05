package com.ilex.account;

/**
 * Vérifie si l'opération demandée est autorisée.
 */
public interface AccountRule {
    
    /**
     * Vérifie si le solde du compte après un retrait est OK pour le type de compte.
     * @param resultingAccountBalance - le montant résultant du retrait
     * @return true si l'opération est autorisée, sinon false
     */
    boolean withdrawPermitted(Double resultingAccountBalance);
}
