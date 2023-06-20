package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes2.dex */
final class zzp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String obj3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj3.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(obj3);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }
}
