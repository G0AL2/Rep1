package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzu  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzzu {
    public static final zzzu zza;
    public static final zzzu zzb;
    public static final zzzu zzc;
    public static final zzzu zzd;
    public static final zzzu zze;
    public static final zzzu zzf;
    public static final zzzu zzg;
    public static final zzzu zzh;
    public static final zzzu zzi;
    public static final zzzu zzj;
    private static final /* synthetic */ zzzu[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzzu zzzuVar = new zzzu("VOID", 0, Void.class, Void.class, null);
        zza = zzzuVar;
        Class cls = Integer.TYPE;
        zzzu zzzuVar2 = new zzzu("INT", 1, cls, Integer.class, 0);
        zzb = zzzuVar2;
        zzzu zzzuVar3 = new zzzu("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzzuVar3;
        zzzu zzzuVar4 = new zzzu("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzzuVar4;
        zzzu zzzuVar5 = new zzzu("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzzuVar5;
        zzzu zzzuVar6 = new zzzu("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzzuVar6;
        zzzu zzzuVar7 = new zzzu("STRING", 6, String.class, String.class, "");
        zzg = zzzuVar7;
        zzzu zzzuVar8 = new zzzu("BYTE_STRING", 7, zzyi.class, zzyi.class, zzyi.zzb);
        zzh = zzzuVar8;
        zzzu zzzuVar9 = new zzzu("ENUM", 8, cls, Integer.class, null);
        zzi = zzzuVar9;
        zzzu zzzuVar10 = new zzzu("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzzuVar10;
        zzk = new zzzu[]{zzzuVar, zzzuVar2, zzzuVar3, zzzuVar4, zzzuVar5, zzzuVar6, zzzuVar7, zzzuVar8, zzzuVar9, zzzuVar10};
    }

    private zzzu(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzzu[] values() {
        return (zzzu[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
