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
package org.palscash.network.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("serial")
public class TransferRequest implements Serializable {

	private String from;

	private String to;

	private String amount;

	private String memo;

	private String requestUuid;

	private String signature;

	private String publicKey;

	private long time = System.currentTimeMillis();

	public String getUniqueTransactionUuid() {
		return getFrom() + getAmount() + getTo() + getRequestUuid() + time;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getAmount() {
		return amount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRequestUuid() {

		if (StringUtils.isBlank(requestUuid)) {
			requestUuid = UUID.randomUUID().toString();
		}

		return requestUuid;
	}

	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public BigDecimal getAmountAsBigDecimal() {
		BigDecimal bd = new BigDecimal(getAmount());
		bd = bd.setScale(8, RoundingMode.CEILING);
		return bd;
	}

	@Override
	public String toString() {
		return "TransferRequest [from=" + from + ", to=" + to + ", amount=" + amount + ", memo=" + memo + ", requestUuid=" + requestUuid + ", signature=" + signature + ", publicKey=" + publicKey + ", time=" + time + "]";
	}

}
