package org.training.catalog.dynamic;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;


public class CustomerDescriptionAttributeHandler implements DynamicAttributeHandler<String, CustomerModel>
{
	@Override
	public String get(CustomerModel model)
	{
		return String.format("%s:%s. Order quantity is: %d", model.getName(), model.getContactEmail(), model.getOrders().size());
	}

	@Override
	public void set(CustomerModel model, String s)
	{
		// read only
		throw new UnsupportedOperationException();
	}
}

