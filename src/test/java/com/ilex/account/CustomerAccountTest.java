package com.ilex.account;


import static org.junit.Assert.*;

import org.junit.*;

import com.ilex.account.Account;
import com.ilex.account.AccountRule;
import com.ilex.account.implementation.*;


/**
 * S'il vous plaît créer le code métier, à partir des tests unitaires ci-dessous.
 *  Mettre en oeuvre le premier test, développer le code qui le fait passer.
 * Puis se concentrer sur le second test, et ainsi de suite.
 * 
 * Nous voulons voir comment vous "pensez code", et comment vous organiser et de structurer une application simple.
 * 
 */
public class CustomerAccountTest {
    
    Account customerAccount;
    AccountRule rule;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception 
    {
        customerAccount = new CustomerAccount();
    }
    
    /**
     * Tests qu'un compte vide a toujours un équilibre de 0,0, pas un NULL.
     */
    @Test
    public void testAccountWithoutMoneyHasZeroBalance()
{
        fail("not yet implemented");
    }
    
    /**
     * Ajoute de l'argent pour le compte et vérifie que le nouvel équilibre est comme prévu.
     */
    @Test
    public void testAddPositiveAmount()
{
        fail("not yet implemented");
    }
    
    /**
     * Tests qu'un retrait illégal jette l'exception attendue.
     * Utilisez la logique contenue dans la règle compte client
     */
    @Test
    public void testWithdrawAndReportBalanceIllegalBalance() 
    {
        fail("not yet implemented");
    }
    
    // Ajouter également les tests unitaires manquants pour les fonctionnalités ci-dessus.

}
