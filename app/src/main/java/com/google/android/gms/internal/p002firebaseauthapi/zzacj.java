package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacj  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzacj {
    public static final zzacj zza;
    public static final zzacj zzb;
    public static final zzacj zzc;
    public static final zzacj zzd;
    public static final zzacj zze;
    public static final zzacj zzf;
    public static final zzacj zzg;
    public static final zzacj zzh;
    public static final zzacj zzi;
    public static final zzacj zzj;
    public static final zzacj zzk;
    public static final zzacj zzl;
    public static final zzacj zzm;
    public static final zzacj zzn;
    public static final zzacj zzo;
    public static final zzacj zzp;
    public static final zzacj zzq;
    public static final zzacj zzr;
    private static final /* synthetic */ zzacj[] zzs;
    private final zzack zzt;

    static {
        zzacj zzacjVar = new zzacj("DOUBLE", 0, zzack.DOUBLE, 1);
        zza = zzacjVar;
        zzacj zzacjVar2 = new zzacj("FLOAT", 1, zzack.FLOAT, 5);
        zzb = zzacjVar2;
        zzack zzackVar = zzack.LONG;
        zzacj zzacjVar3 = new zzacj("INT64", 2, zzackVar, 0);
        zzc = zzacjVar3;
        zzacj zzacjVar4 = new zzacj("UINT64", 3, zzackVar, 0);
        zzd = zzacjVar4;
        zzack zzackVar2 = zzack.INT;
        zzacj zzacjVar5 = new zzacj("INT32", 4, zzackVar2, 0);
        zze = zzacjVar5;
        zzacj zzacjVar6 = new zzacj("FIXED64", 5, zzackVar, 1);
        zzf = zzacjVar6;
        zzacj zzacjVar7 = new zzacj("FIXED32", 6, zzackVar2, 5);
        zzg = zzacjVar7;
        zzacj zzacjVar8 = new zzacj("BOOL", 7, zzack.BOOLEAN, 0);
        zzh = zzacjVar8;
        zzacj zzacjVar9 = new zzacj("STRING", 8, zzack.STRING, 2);
        zzi = zzacjVar9;
        zzack zzackVar3 = zzack.MESSAGE;
        zzacj zzacjVar10 = new zzacj("GROUP", 9, zzackVar3, 3);
        zzj = zzacjVar10;
        zzacj zzacjVar11 = new zzacj("MESSAGE", 10, zzackVar3, 2);
        zzk = zzacjVar11;
        zzacj zzacjVar12 = new zzacj("BYTES", 11, zzack.BYTE_STRING, 2);
        zzl = zzacjVar12;
        zzacj zzacjVar13 = new zzacj("UINT32", 12, zzackVar2, 0);
        zzm = zzacjVar13;
        zzacj zzacjVar14 = new zzacj("ENUM", 13, zzack.ENUM, 0);
        zzn = zzacjVar14;
        zzacj zzacjVar15 = new zzacj("SFIXED32", 14, zzackVar2, 5);
        zzo = zzacjVar15;
        zzacj zzacjVar16 = new zzacj("SFIXED64", 15, zzackVar, 1);
        zzp = zzacjVar16;
        zzacj zzacjVar17 = new zzacj("SINT32", 16, zzackVar2, 0);
        zzq = zzacjVar17;
        zzacj zzacjVar18 = new zzacj("SINT64", 17, zzackVar, 0);
        zzr = zzacjVar18;
        zzs = new zzacj[]{zzacjVar, zzacjVar2, zzacjVar3, zzacjVar4, zzacjVar5, zzacjVar6, zzacjVar7, zzacjVar8, zzacjVar9, zzacjVar10, zzacjVar11, zzacjVar12, zzacjVar13, zzacjVar14, zzacjVar15, zzacjVar16, zzacjVar17, zzacjVar18};
    }

    private zzacj(String str, int i10, zzack zzackVar, int i11) {
        this.zzt = zzackVar;
    }

    public static zzacj[] values() {
        return (zzacj[]) zzs.clone();
    }

    public final zzack zza() {
        return this.zzt;
    }
}
