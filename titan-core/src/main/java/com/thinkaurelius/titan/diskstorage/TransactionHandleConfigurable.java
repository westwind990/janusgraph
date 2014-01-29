package com.thinkaurelius.titan.diskstorage;


import com.thinkaurelius.titan.diskstorage.util.StandardTransactionConfig;

/**
 * An extension to the {@link TransactionHandle} interface that exposes a
 * configuration object of type {@link TransactionHandleConfig} for this particular transaction.
 *
 * @author Matthias Broecheler (me@matthiasb.com)
 */
public interface TransactionHandleConfigurable extends TransactionHandle {

    public TransactionHandleConfig getConfiguration();

}
