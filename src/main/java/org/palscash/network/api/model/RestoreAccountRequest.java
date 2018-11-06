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

import org.palscash.common.crypto.mnemonics.Mnemonics.Language;

/**
 * Get new account key pair
 */
@SuppressWarnings("serial")
public class RestoreAccountRequest implements Serializable {

	private String language = Language.ENGLISH.name();

	private String[] mnemonics;

	private String curve;

	public RestoreAccountRequest() {
		super();
	}

	public RestoreAccountRequest(Language language, String[] mnemonics, String curve) {
		super();
		this.language = language.name();
		this.mnemonics = mnemonics;
		this.curve = curve;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getMnemonics() {
		return mnemonics;
	}

	public void setMnemonics(String[] mnemonics) {
		this.mnemonics = mnemonics;
	}

	public String getCurve() {
		return curve;
	}

	public void setCurve(String curve) {
		this.curve = curve;
	}

	@Override
	public String toString() {
		return "RestoreAccountRequest [language=" + language + ", curve=" + curve + "]";
	}

}
