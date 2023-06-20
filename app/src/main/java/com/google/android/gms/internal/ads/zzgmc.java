package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgmc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzgma zzgmaVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzgmaVar, sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb2, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb2, i10, str, entry);
            }
        } else {
            sb2.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzgni.zza(zzgji.zzx((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzgji) {
                sb2.append(": \"");
                sb2.append(zzgni.zza((zzgji) obj));
                sb2.append('\"');
            } else if (obj instanceof zzgkq) {
                sb2.append(" {");
                zzd((zzgkq) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i13 = i10 + 2;
                zzb(sb2, i13, "key", entry2.getKey());
                zzb(sb2, i13, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry2.getValue());
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    private static void zzd(zzgma zzgmaVar, StringBuilder sb2, int i10) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzgmaVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i10, zzc(concat), zzgkq.zzaN(method2, zzgmaVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i10, zzc(concat2), zzgkq.zzaN(method3, zzgmaVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzaN = zzgkq.zzaN(method4, zzgmaVar, new Object[0]);
                    if (method5 == null) {
                        if (zzaN instanceof Boolean) {
                            if (((Boolean) zzaN).booleanValue()) {
                                zzb(sb2, i10, zzc(concat3), zzaN);
                            }
                        } else if (zzaN instanceof Integer) {
                            if (((Integer) zzaN).intValue() != 0) {
                                zzb(sb2, i10, zzc(concat3), zzaN);
                            }
                        } else if (zzaN instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaN).floatValue()) != 0) {
                                zzb(sb2, i10, zzc(concat3), zzaN);
                            }
                        } else if (zzaN instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzaN).doubleValue()) != 0) {
                                zzb(sb2, i10, zzc(concat3), zzaN);
                            }
                        } else {
                            if (zzaN instanceof String) {
                                equals = zzaN.equals("");
                            } else if (zzaN instanceof zzgji) {
                                equals = zzaN.equals(zzgji.zzb);
                            } else if (zzaN instanceof zzgma) {
                                if (zzaN != ((zzgma) zzaN).zzbh()) {
                                    zzb(sb2, i10, zzc(concat3), zzaN);
                                }
                            } else {
                                if ((zzaN instanceof Enum) && ((Enum) zzaN).ordinal() == 0) {
                                }
                                zzb(sb2, i10, zzc(concat3), zzaN);
                            }
                            if (!equals) {
                                zzb(sb2, i10, zzc(concat3), zzaN);
                            }
                        }
                    } else if (((Boolean) zzgkq.zzaN(method5, zzgmaVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, zzc(concat3), zzaN);
                    }
                }
            }
        }
        if (!(zzgmaVar instanceof zzgkn)) {
            zzgnl zzgnlVar = ((zzgkq) zzgmaVar).zzc;
            if (zzgnlVar != null) {
                zzgnlVar.zzg(sb2, i10);
                return;
            }
            return;
        }
        zzgkn zzgknVar = (zzgkn) zzgmaVar;
        throw null;
    }
}
