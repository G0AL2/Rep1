package com.google.android.gms.internal.ads;

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
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgoa {
    public static final zzgoa zza;
    public static final zzgoa zzb;
    public static final zzgoa zzc;
    public static final zzgoa zzd;
    public static final zzgoa zze;
    public static final zzgoa zzf;
    public static final zzgoa zzg;
    public static final zzgoa zzh;
    public static final zzgoa zzi;
    public static final zzgoa zzj;
    public static final zzgoa zzk;
    public static final zzgoa zzl;
    public static final zzgoa zzm;
    public static final zzgoa zzn;
    public static final zzgoa zzo;
    public static final zzgoa zzp;
    public static final zzgoa zzq;
    public static final zzgoa zzr;
    private static final /* synthetic */ zzgoa[] zzs;
    private final zzgob zzt;

    static {
        zzgoa zzgoaVar = new zzgoa("DOUBLE", 0, zzgob.DOUBLE, 1);
        zza = zzgoaVar;
        zzgoa zzgoaVar2 = new zzgoa("FLOAT", 1, zzgob.FLOAT, 5);
        zzb = zzgoaVar2;
        zzgob zzgobVar = zzgob.LONG;
        zzgoa zzgoaVar3 = new zzgoa("INT64", 2, zzgobVar, 0);
        zzc = zzgoaVar3;
        zzgoa zzgoaVar4 = new zzgoa("UINT64", 3, zzgobVar, 0);
        zzd = zzgoaVar4;
        zzgob zzgobVar2 = zzgob.INT;
        zzgoa zzgoaVar5 = new zzgoa("INT32", 4, zzgobVar2, 0);
        zze = zzgoaVar5;
        zzgoa zzgoaVar6 = new zzgoa("FIXED64", 5, zzgobVar, 1);
        zzf = zzgoaVar6;
        zzgoa zzgoaVar7 = new zzgoa("FIXED32", 6, zzgobVar2, 5);
        zzg = zzgoaVar7;
        zzgoa zzgoaVar8 = new zzgoa("BOOL", 7, zzgob.BOOLEAN, 0);
        zzh = zzgoaVar8;
        zzgoa zzgoaVar9 = new zzgoa("STRING", 8, zzgob.STRING, 2);
        zzi = zzgoaVar9;
        zzgob zzgobVar3 = zzgob.MESSAGE;
        zzgoa zzgoaVar10 = new zzgoa("GROUP", 9, zzgobVar3, 3);
        zzj = zzgoaVar10;
        zzgoa zzgoaVar11 = new zzgoa("MESSAGE", 10, zzgobVar3, 2);
        zzk = zzgoaVar11;
        zzgoa zzgoaVar12 = new zzgoa("BYTES", 11, zzgob.BYTE_STRING, 2);
        zzl = zzgoaVar12;
        zzgoa zzgoaVar13 = new zzgoa("UINT32", 12, zzgobVar2, 0);
        zzm = zzgoaVar13;
        zzgoa zzgoaVar14 = new zzgoa("ENUM", 13, zzgob.ENUM, 0);
        zzn = zzgoaVar14;
        zzgoa zzgoaVar15 = new zzgoa("SFIXED32", 14, zzgobVar2, 5);
        zzo = zzgoaVar15;
        zzgoa zzgoaVar16 = new zzgoa("SFIXED64", 15, zzgobVar, 1);
        zzp = zzgoaVar16;
        zzgoa zzgoaVar17 = new zzgoa("SINT32", 16, zzgobVar2, 0);
        zzq = zzgoaVar17;
        zzgoa zzgoaVar18 = new zzgoa("SINT64", 17, zzgobVar, 0);
        zzr = zzgoaVar18;
        zzs = new zzgoa[]{zzgoaVar, zzgoaVar2, zzgoaVar3, zzgoaVar4, zzgoaVar5, zzgoaVar6, zzgoaVar7, zzgoaVar8, zzgoaVar9, zzgoaVar10, zzgoaVar11, zzgoaVar12, zzgoaVar13, zzgoaVar14, zzgoaVar15, zzgoaVar16, zzgoaVar17, zzgoaVar18};
    }

    private zzgoa(String str, int i10, zzgob zzgobVar, int i11) {
        this.zzt = zzgobVar;
    }

    public static zzgoa[] values() {
        return (zzgoa[]) zzs.clone();
    }

    public final zzgob zza() {
        return this.zzt;
    }
}
