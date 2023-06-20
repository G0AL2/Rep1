package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaas  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzaas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzaaq zzaaqVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzaaqVar, sb2, 0);
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
                sb2.append(zzabr.zza(zzyi.zzp((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzyi) {
                sb2.append(": \"");
                sb2.append(zzabr.zza((zzyi) obj));
                sb2.append('\"');
            } else if (obj instanceof zzzl) {
                sb2.append(" {");
                zzd((zzzl) obj, sb2, i10 + 2);
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

    private static void zzd(zzaaq zzaaqVar, StringBuilder sb2, int i10) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzaaqVar.getClass().getDeclaredMethods()) {
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
                    zzb(sb2, i10, zzc(concat), zzzl.zzC(method2, zzaaqVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i10, zzc(concat2), zzzl.zzC(method3, zzaaqVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzC = zzzl.zzC(method4, zzaaqVar, new Object[0]);
                    if (method5 == null) {
                        if (zzC instanceof Boolean) {
                            if (((Boolean) zzC).booleanValue()) {
                                zzb(sb2, i10, zzc(concat3), zzC);
                            }
                        } else if (zzC instanceof Integer) {
                            if (((Integer) zzC).intValue() != 0) {
                                zzb(sb2, i10, zzc(concat3), zzC);
                            }
                        } else if (zzC instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzC).floatValue()) != 0) {
                                zzb(sb2, i10, zzc(concat3), zzC);
                            }
                        } else if (zzC instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzC).doubleValue()) != 0) {
                                zzb(sb2, i10, zzc(concat3), zzC);
                            }
                        } else {
                            if (zzC instanceof String) {
                                equals = zzC.equals("");
                            } else if (zzC instanceof zzyi) {
                                equals = zzC.equals(zzyi.zzb);
                            } else if (zzC instanceof zzaaq) {
                                if (zzC != ((zzaaq) zzC).zzH()) {
                                    zzb(sb2, i10, zzc(concat3), zzC);
                                }
                            } else {
                                if ((zzC instanceof Enum) && ((Enum) zzC).ordinal() == 0) {
                                }
                                zzb(sb2, i10, zzc(concat3), zzC);
                            }
                            if (!equals) {
                                zzb(sb2, i10, zzc(concat3), zzC);
                            }
                        }
                    } else if (((Boolean) zzzl.zzC(method5, zzaaqVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, zzc(concat3), zzC);
                    }
                }
            }
        }
        if (!(zzaaqVar instanceof zzzi)) {
            zzabu zzabuVar = ((zzzl) zzaaqVar).zzc;
            if (zzabuVar != null) {
                zzabuVar.zzg(sb2, i10);
                return;
            }
            return;
        }
        zzzi zzziVar = (zzzi) zzaaqVar;
        throw null;
    }
}
