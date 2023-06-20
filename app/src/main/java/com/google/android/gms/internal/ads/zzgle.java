package com.google.android.gms.internal.ads;

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
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgle {
    public static final zzgle zza;
    public static final zzgle zzb;
    public static final zzgle zzc;
    public static final zzgle zzd;
    public static final zzgle zze;
    public static final zzgle zzf;
    public static final zzgle zzg;
    public static final zzgle zzh;
    public static final zzgle zzi;
    public static final zzgle zzj;
    private static final /* synthetic */ zzgle[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzgle zzgleVar = new zzgle("VOID", 0, Void.class, Void.class, null);
        zza = zzgleVar;
        Class cls = Integer.TYPE;
        zzgle zzgleVar2 = new zzgle("INT", 1, cls, Integer.class, 0);
        zzb = zzgleVar2;
        zzgle zzgleVar3 = new zzgle("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgleVar3;
        zzgle zzgleVar4 = new zzgle("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgleVar4;
        zzgle zzgleVar5 = new zzgle("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgleVar5;
        zzgle zzgleVar6 = new zzgle("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgleVar6;
        zzgle zzgleVar7 = new zzgle("STRING", 6, String.class, String.class, "");
        zzg = zzgleVar7;
        zzgle zzgleVar8 = new zzgle("BYTE_STRING", 7, zzgji.class, zzgji.class, zzgji.zzb);
        zzh = zzgleVar8;
        zzgle zzgleVar9 = new zzgle("ENUM", 8, cls, Integer.class, null);
        zzi = zzgleVar9;
        zzgle zzgleVar10 = new zzgle("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgleVar10;
        zzk = new zzgle[]{zzgleVar, zzgleVar2, zzgleVar3, zzgleVar4, zzgleVar5, zzgleVar6, zzgleVar7, zzgleVar8, zzgleVar9, zzgleVar10};
    }

    private zzgle(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzgle[] values() {
        return (zzgle[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
