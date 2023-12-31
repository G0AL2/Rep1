package com.ironsource.mediationsdk.metadata;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.metadata.MetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class MetaDataUtils {
    public static String checkMetaDataKeyValidity(String str) {
        return (str == null || str.length() > 64 || !str.matches("[A-Za-z0-9_\\-.]+")) ? "The MetaData key you entered is invalid. Please enter a key of maximum 64 characters that consists of only letters, digits and the following characters: . - _" : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String checkMetaDataValueValidity(java.util.List<java.lang.String> r3) {
        /*
            int r0 = r3.size()
            if (r0 != 0) goto L9
            java.lang.String r3 = "The MetaData list should include at least one element."
            return r3
        L9:
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2b
            int r1 = r0.length()
            r2 = 64
            if (r1 > r2) goto L2b
            java.lang.String r1 = "[A-Za-z0-9_\\-.]+"
            boolean r0 = r0.matches(r1)
            if (r0 != 0) goto Ld
        L2b:
            java.lang.String r3 = "The MetaData value(s) you entered is invalid. Please enter a value of maximum 64 characters that consists of only letters, digits and the following characters: . - _"
            return r3
        L2e:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.metadata.MetaDataUtils.checkMetaDataValueValidity(java.util.List):java.lang.String");
    }

    public static MetaData formatMetaData(String str, List<String> list) {
        if (isKnownKey(str)) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list) {
                MetaData.MetaDataValueTypes valueTypeForKey = getValueTypeForKey(lowerCase);
                String formatValueForType = formatValueForType(str2, valueTypeForKey);
                arrayList.add(valueTypeForKey);
                arrayList2.add(formatValueForType);
            }
            return new MetaData(lowerCase, arrayList2, arrayList);
        }
        return new MetaData(str, list);
    }

    public static String formatValueForType(String str, MetaData.MetaDataValueTypes metaDataValueTypes) {
        return metaDataValueTypes == MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN ? (str.equalsIgnoreCase(InneractiveMediationDefs.SHOW_HOUSE_AD_YES) || str.equalsIgnoreCase("yes")) ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no")) ? "false" : "" : str;
    }

    public static boolean getMetaDataBooleanValue(String str) {
        return !str.equals("false");
    }

    public static MetaData.MetaDataValueTypes getValueTypeForKey(String str) {
        return (str.equalsIgnoreCase("do_not_sell") || str.equalsIgnoreCase("is_child_directed") || str.equalsIgnoreCase("is_deviceid_optout")) ? MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN : MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING;
    }

    public static boolean isKnownKey(String str) {
        return str.equalsIgnoreCase("do_not_sell") || str.equalsIgnoreCase("is_child_directed") || str.equalsIgnoreCase("is_deviceid_optout");
    }

    public static boolean isMediationKeysBeforeInit(String str) {
        return str.equalsIgnoreCase("is_deviceid_optout");
    }

    public static boolean isMediationOnlyKey(String str) {
        return str.equalsIgnoreCase("is_child_directed") || str.equalsIgnoreCase("is_deviceid_optout");
    }

    public static boolean isValidCCPAMetaData(String str, String str2) {
        return str.equals("do_not_sell") && str2.length() > 0;
    }
}
