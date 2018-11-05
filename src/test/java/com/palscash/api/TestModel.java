package com.palscash.api;

import org.palscash.network.api.Urls;
import org.palscash.network.api.model.ErrorResponse;
import org.palscash.network.api.model.GetAccountResponse;
import org.palscash.network.api.model.GetBalanceResponse;
import org.palscash.network.api.model.GetFeeResponse;
import org.palscash.network.api.model.GetNewAccountRequest;
import org.palscash.network.api.model.GetNewAccountResponse;
import org.palscash.network.api.model.MetaData;
import org.palscash.network.api.model.PingResponse;
import org.palscash.network.api.model.TransactionCountResponse;
import org.palscash.network.api.model.TransactionInfo;
import org.palscash.network.api.model.TransactionListResponse;
import org.palscash.network.api.model.TransferRequest;
import org.palscash.network.api.model.TransferResponse;

import junit.framework.TestCase;

public class TestModel extends TestCase {

	public void test() {
		
		new Urls();
		
		{
			new ErrorResponse();
			ErrorResponse o = new ErrorResponse("Error Test");
			assertEquals("Error Test", o.getError());
			assertEquals("error-response", o.getType());
			o.setError("Error Test");
			assertEquals("Error Test", o.getError());
			
			assertNotNull(o.getResponseMetadata());
			assertNotNull(o.toString());
			System.out.println(o.hashCode());
			assertTrue(o.hashCode() != 0);
			assertTrue(o.equals(o));
		}
		
		new GetAccountResponse();
		new GetBalanceResponse();
		new GetFeeResponse();
		new GetNewAccountRequest();
		new GetNewAccountResponse();
		new MetaData();
		new PingResponse();
		new TransactionCountResponse();
		new TransactionInfo();
		new TransactionListResponse();
		new TransferRequest();
		new TransferResponse();
		
		
		
	}
	
}
