package com.google.android.gms.internal.auth;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzfs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzfq zzfqVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzfqVar, sb2, 0);
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
                sb2.append(zzgn.zza(zzeb.zzl((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzeb) {
                sb2.append(": \"");
                sb2.append(zzgn.zza((zzeb) obj));
                sb2.append('\"');
            } else if (obj instanceof zzeq) {
                sb2.append(" {");
                zzd((zzeq) obj, sb2, i10 + 2);
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
                sb2.append(obj.toString());
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

    private static void zzd(zzfq zzfqVar, StringBuilder sb2, int i10) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzfqVar.getClass().getDeclaredMethods()) {
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
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i10, zzc(concat), zzeq.zzf(method2, zzfqVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i10, zzc(concat2), zzeq.zzf(method3, zzfqVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object zzf = zzeq.zzf(method4, zzfqVar, new Object[0]);
                    if (method5 == null) {
                        if (zzf instanceof Boolean) {
                            if (((Boolean) zzf).booleanValue()) {
                                zzb(sb2, i10, zzc(concat3), zzf);
                            }
                        } else if (zzf instanceof Integer) {
                            if (((Integer) zzf).intValue() != 0) {
                                zzb(sb2, i10, zzc(concat3), zzf);
                            }
                        } else if (zzf instanceof Float) {
                            if (((Float) zzf).floatValue() != 0.0f) {
                                zzb(sb2, i10, zzc(concat3), zzf);
                            }
                        } else if (zzf instanceof Double) {
                            if (((Double) zzf).doubleValue() != 0.0d) {
                                zzb(sb2, i10, zzc(concat3), zzf);
                            }
                        } else {
                            if (zzf instanceof String) {
                                equals = zzf.equals("");
                            } else if (zzf instanceof zzeb) {
                                equals = zzf.equals(zzeb.zzb);
                            } else if (zzf instanceof zzfq) {
                                if (zzf != ((zzfq) zzf).zzh()) {
                                    zzb(sb2, i10, zzc(concat3), zzf);
                                }
                            } else {
                                if ((zzf instanceof Enum) && ((Enum) zzf).ordinal() == 0) {
                                }
                                zzb(sb2, i10, zzc(concat3), zzf);
                            }
                            if (!equals) {
                                zzb(sb2, i10, zzc(concat3), zzf);
                            }
                        }
                    } else if (((Boolean) zzeq.zzf(method5, zzfqVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, zzc(concat3), zzf);
                    }
                }
            }
        }
        if (!(zzfqVar instanceof zzep)) {
            zzgq zzgqVar = ((zzeq) zzfqVar).zzc;
            if (zzgqVar != null) {
                zzgqVar.zze(sb2, i10);
                return;
            }
            return;
        }
        zzep zzepVar = (zzep) zzfqVar;
        throw null;
    }
}
