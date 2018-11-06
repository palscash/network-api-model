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

import org.apache.commons.lang3.StringUtils;

/**
 * Current network fee
 */
@SuppressWarnings("serial")
public class GetFeeResponse extends BaseModelObject {

	private String fee = StringUtils.EMPTY;

	public GetFeeResponse() {
		super();
	}

	public GetFeeResponse(String v) {
		this();
		this.fee = v;
	}

	@Override
	public String getType() {
		return "get-fee";
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getFee() {
		return fee;
	}

	@Override
	public String toString() {
		return "GetFeeResponse [getType()=" + getType() + ", getFee()=" + getFee() + "]";
	}

}