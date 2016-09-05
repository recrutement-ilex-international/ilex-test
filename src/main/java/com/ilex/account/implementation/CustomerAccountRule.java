package com.ilex.account.implementation;

import com.ilex.account.*;


public class CustomerAccountRule implements AccountRule {

    /* (non-Javadoc)
     * @see com.ilex.account.AccountRule#withdrawPermitted(java.lang.Double)
     */
    public boolean withdrawPermitted(Double resultingAccountBalance) {
        return resultingAccountBalance >= 0;
    }

}
