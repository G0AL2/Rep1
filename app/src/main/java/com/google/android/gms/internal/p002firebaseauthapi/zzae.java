package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzae  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzae {
    public static String zza(String str) {
        if (zzv.zzc(str)) {
            return null;
        }
        return str;
    }

    public static String zzb(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", sb4.length() != 0 ? "Exception during lenientFormat for ".concat(sb4) : new String("Exception during lenientFormat for "), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(sb4.length() + 9 + name2.length());
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i11] = sb2;
            i11++;
        }
        StringBuilder sb6 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i12, indexOf);
            sb6.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb6.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb6.append(" [");
            sb6.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb6.append(", ");
                sb6.append(objArr[i13]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static String zzc(String str) {
        return zzv.zzb(str);
    }

    public static boolean zzd(String str) {
        return zzv.zzc(str);
    }
}
