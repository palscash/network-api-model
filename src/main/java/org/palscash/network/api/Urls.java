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
package org.palscash.network.api;

public class Urls {

	public static final String URL_PING = "/api/ping";

	public static final String URL_GET_TX_FEE = "/api/fee";

	public static final String URL_GET_NEW_ACCOUNT = "/api/account/new";

	public static final String URL_GET_RESTORE_ACCOUNT = "/api/account/restore";

	public static final String URL_GET_BALANCE = "/api/account/balance/{address}";

	public static final String URL_GET_ACCOUNT = "/api/account/get/{address}";

	public static final String URL_TRANSFER = "/api/transfer";

	public static final String URL_GET_TX_DETAILS = "/api/tx/{uuid}";

	public static final String URL_GET_TX_COUNT = "/api/tx/count/{uuid}";

	public static final String URL_LIST_TX_FROM = "/api/list/tx/from/{uuid}";

	public static final String URL_LIST_TX_TO = "/api/list/tx/to/{uuid}";

}
