package com.ilex.account;

/**
 * Cette classe représente un compte simple.
 * Le compte ne gère pas des devises différentes, tout l'argent est censé être dans la monnaie de référence EUR.
 */
public interface Account {
    
    /**
     * Ajoute de l'argent à ce compte.
     * @param addedAmount - l'argent à ajouter
     */
    public void add(Double addedAmount);
    
    /**
     * Retire l'argent du compte
     * @param withdrawnAmount - l'argent à retirer
     * @param rule - l'AccountRule qui définit l'équilibre qui est autorisé pour ce compte
     * @return le solde du compte
     * @throws IllegalBalanceException si le retrait quitte le compte avec un solde interdit
     */
    public Double withdrawAndReportBalance(Double withdrawnAmount, AccountRule rule) throws IllegalBalanceException;
    
    /**
     * Recuperation du solde du compte courant.
     * @return le solde du compte
     */
    public Double getBalance();
}
