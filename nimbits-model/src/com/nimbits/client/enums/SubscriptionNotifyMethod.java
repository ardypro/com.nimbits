/*
 * Copyright (c) 2010 Tonic Solutions LLC.
 *
 * http://www.nimbits.com
 *
 *
 * Licensed under the GNU GENERAL PUBLIC LICENSE, Version 3.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the license is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.client.enums;

import java.util.*;

/**
 * Created by bsautner
 * User: benjamin
 * Date: 6/24/11
 * Time: 1:00 PM
 */
public enum SubscriptionNotifyMethod {
    none(-1, "None"),
    email(0, "Email"),
    facebook(1, "Facebook"),
    twitter(2, "Twitter"),
    instantMessage(3, "Instant Message (XMPP)"),
    feed(4, "Nimbits Data Feed");



    private static final Map<Integer, SubscriptionNotifyMethod> lookup = new HashMap<Integer, SubscriptionNotifyMethod>();

    static {
        for (SubscriptionNotifyMethod s : EnumSet.allOf(SubscriptionNotifyMethod.class))
            lookup.put(s.getCode(), s);
    }

    private final int code;
    private final String text;

    private SubscriptionNotifyMethod(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getCode() {
        return code;
    }

    public static SubscriptionNotifyMethod get(int code) {
        return lookup.get(code);
    }

}
