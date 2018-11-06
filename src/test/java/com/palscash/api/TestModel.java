/*

MIT License

Copyright (c) 2017 ZDP Developers
Copyright (c) 2018 PalsCash Team

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
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
