package com.facebook.hermes.unicode;

import g6.a;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;

@a
/* loaded from: classes.dex */
public class AndroidUnicodeUtils {
    @a
    public static String convertToCase(String str, int i10, boolean z10) {
        Locale locale = z10 ? Locale.getDefault() : Locale.ENGLISH;
        if (i10 != 0) {
            if (i10 == 1) {
                return str.toLowerCase(locale);
            }
            throw new RuntimeException("Invalid target case");
        }
        return str.toUpperCase(locale);
    }

    @a
    public static String dateFormat(double d10, boolean z10, boolean z11) {
        DateFormat timeInstance;
        if (z10 && z11) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z10) {
            timeInstance = DateFormat.getDateInstance(2);
        } else if (z11) {
            timeInstance = DateFormat.getTimeInstance(2);
        } else {
            throw new RuntimeException("Bad dateFormat configuration");
        }
        return timeInstance.format(Long.valueOf((long) d10)).toString();
    }

    @a
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @a
    public static String normalize(String str, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return Normalizer.normalize(str, Normalizer.Form.NFKD);
                    }
                    throw new RuntimeException("Invalid form");
                }
                return Normalizer.normalize(str, Normalizer.Form.NFKC);
            }
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        return Normalizer.normalize(str, Normalizer.Form.NFC);
    }
}
