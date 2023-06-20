package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zza uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzze  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzze {
    public static final zzze zzA;
    public static final zzze zzB;
    public static final zzze zzC;
    public static final zzze zzD;
    public static final zzze zzE;
    public static final zzze zzF;
    public static final zzze zzG;
    public static final zzze zzH;
    public static final zzze zzI;
    public static final zzze zzJ;
    public static final zzze zzK;
    public static final zzze zzL;
    public static final zzze zzM;
    public static final zzze zzN;
    public static final zzze zzO;
    public static final zzze zzP;
    public static final zzze zzQ;
    public static final zzze zzR;
    public static final zzze zzS;
    public static final zzze zzT;
    public static final zzze zzU;
    public static final zzze zzV;
    public static final zzze zzW;
    public static final zzze zzX;
    public static final zzze zzY;
    private static final zzze[] zzZ;
    public static final zzze zza;
    private static final /* synthetic */ zzze[] zzaa;
    public static final zzze zzb;
    public static final zzze zzc;
    public static final zzze zzd;
    public static final zzze zze;
    public static final zzze zzf;
    public static final zzze zzg;
    public static final zzze zzh;
    public static final zzze zzi;
    public static final zzze zzj;
    public static final zzze zzk;
    public static final zzze zzl;
    public static final zzze zzm;
    public static final zzze zzn;
    public static final zzze zzo;
    public static final zzze zzp;
    public static final zzze zzq;
    public static final zzze zzr;
    public static final zzze zzs;
    public static final zzze zzt;
    public static final zzze zzu;
    public static final zzze zzv;
    public static final zzze zzw;
    public static final zzze zzx;
    public static final zzze zzy;
    public static final zzze zzz;
    private final zzzu zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzzu zzzuVar = zzzu.zze;
        zzze zzzeVar = new zzze("DOUBLE", 0, 0, 1, zzzuVar);
        zza = zzzeVar;
        zzzu zzzuVar2 = zzzu.zzd;
        zzze zzzeVar2 = new zzze("FLOAT", 1, 1, 1, zzzuVar2);
        zzb = zzzeVar2;
        zzzu zzzuVar3 = zzzu.zzc;
        zzze zzzeVar3 = new zzze("INT64", 2, 2, 1, zzzuVar3);
        zzc = zzzeVar3;
        zzze zzzeVar4 = new zzze("UINT64", 3, 3, 1, zzzuVar3);
        zzd = zzzeVar4;
        zzzu zzzuVar4 = zzzu.zzb;
        zzze zzzeVar5 = new zzze("INT32", 4, 4, 1, zzzuVar4);
        zze = zzzeVar5;
        zzze zzzeVar6 = new zzze("FIXED64", 5, 5, 1, zzzuVar3);
        zzf = zzzeVar6;
        zzze zzzeVar7 = new zzze("FIXED32", 6, 6, 1, zzzuVar4);
        zzg = zzzeVar7;
        zzzu zzzuVar5 = zzzu.zzf;
        zzze zzzeVar8 = new zzze("BOOL", 7, 7, 1, zzzuVar5);
        zzh = zzzeVar8;
        zzzu zzzuVar6 = zzzu.zzg;
        zzze zzzeVar9 = new zzze("STRING", 8, 8, 1, zzzuVar6);
        zzi = zzzeVar9;
        zzzu zzzuVar7 = zzzu.zzj;
        zzze zzzeVar10 = new zzze("MESSAGE", 9, 9, 1, zzzuVar7);
        zzj = zzzeVar10;
        zzzu zzzuVar8 = zzzu.zzh;
        zzze zzzeVar11 = new zzze("BYTES", 10, 10, 1, zzzuVar8);
        zzk = zzzeVar11;
        zzze zzzeVar12 = new zzze("UINT32", 11, 11, 1, zzzuVar4);
        zzl = zzzeVar12;
        zzzu zzzuVar9 = zzzu.zzi;
        zzze zzzeVar13 = new zzze("ENUM", 12, 12, 1, zzzuVar9);
        zzm = zzzeVar13;
        zzze zzzeVar14 = new zzze("SFIXED32", 13, 13, 1, zzzuVar4);
        zzn = zzzeVar14;
        zzze zzzeVar15 = new zzze("SFIXED64", 14, 14, 1, zzzuVar3);
        zzo = zzzeVar15;
        zzze zzzeVar16 = new zzze("SINT32", 15, 15, 1, zzzuVar4);
        zzp = zzzeVar16;
        zzze zzzeVar17 = new zzze("SINT64", 16, 16, 1, zzzuVar3);
        zzq = zzzeVar17;
        zzze zzzeVar18 = new zzze("GROUP", 17, 17, 1, zzzuVar7);
        zzr = zzzeVar18;
        zzze zzzeVar19 = new zzze("DOUBLE_LIST", 18, 18, 2, zzzuVar);
        zzs = zzzeVar19;
        zzze zzzeVar20 = new zzze("FLOAT_LIST", 19, 19, 2, zzzuVar2);
        zzt = zzzeVar20;
        zzze zzzeVar21 = new zzze("INT64_LIST", 20, 20, 2, zzzuVar3);
        zzu = zzzeVar21;
        zzze zzzeVar22 = new zzze("UINT64_LIST", 21, 21, 2, zzzuVar3);
        zzv = zzzeVar22;
        zzze zzzeVar23 = new zzze("INT32_LIST", 22, 22, 2, zzzuVar4);
        zzw = zzzeVar23;
        zzze zzzeVar24 = new zzze("FIXED64_LIST", 23, 23, 2, zzzuVar3);
        zzx = zzzeVar24;
        zzze zzzeVar25 = new zzze("FIXED32_LIST", 24, 24, 2, zzzuVar4);
        zzy = zzzeVar25;
        zzze zzzeVar26 = new zzze("BOOL_LIST", 25, 25, 2, zzzuVar5);
        zzz = zzzeVar26;
        zzze zzzeVar27 = new zzze("STRING_LIST", 26, 26, 2, zzzuVar6);
        zzA = zzzeVar27;
        zzze zzzeVar28 = new zzze("MESSAGE_LIST", 27, 27, 2, zzzuVar7);
        zzB = zzzeVar28;
        zzze zzzeVar29 = new zzze("BYTES_LIST", 28, 28, 2, zzzuVar8);
        zzC = zzzeVar29;
        zzze zzzeVar30 = new zzze("UINT32_LIST", 29, 29, 2, zzzuVar4);
        zzD = zzzeVar30;
        zzze zzzeVar31 = new zzze("ENUM_LIST", 30, 30, 2, zzzuVar9);
        zzE = zzzeVar31;
        zzze zzzeVar32 = new zzze("SFIXED32_LIST", 31, 31, 2, zzzuVar4);
        zzF = zzzeVar32;
        zzze zzzeVar33 = new zzze("SFIXED64_LIST", 32, 32, 2, zzzuVar3);
        zzG = zzzeVar33;
        zzze zzzeVar34 = new zzze("SINT32_LIST", 33, 33, 2, zzzuVar4);
        zzH = zzzeVar34;
        zzze zzzeVar35 = new zzze("SINT64_LIST", 34, 34, 2, zzzuVar3);
        zzI = zzzeVar35;
        zzze zzzeVar36 = new zzze("DOUBLE_LIST_PACKED", 35, 35, 3, zzzuVar);
        zzJ = zzzeVar36;
        zzze zzzeVar37 = new zzze("FLOAT_LIST_PACKED", 36, 36, 3, zzzuVar2);
        zzK = zzzeVar37;
        zzze zzzeVar38 = new zzze("INT64_LIST_PACKED", 37, 37, 3, zzzuVar3);
        zzL = zzzeVar38;
        zzze zzzeVar39 = new zzze("UINT64_LIST_PACKED", 38, 38, 3, zzzuVar3);
        zzM = zzzeVar39;
        zzze zzzeVar40 = new zzze("INT32_LIST_PACKED", 39, 39, 3, zzzuVar4);
        zzN = zzzeVar40;
        zzze zzzeVar41 = new zzze("FIXED64_LIST_PACKED", 40, 40, 3, zzzuVar3);
        zzO = zzzeVar41;
        zzze zzzeVar42 = new zzze("FIXED32_LIST_PACKED", 41, 41, 3, zzzuVar4);
        zzP = zzzeVar42;
        zzze zzzeVar43 = new zzze("BOOL_LIST_PACKED", 42, 42, 3, zzzuVar5);
        zzQ = zzzeVar43;
        zzze zzzeVar44 = new zzze("UINT32_LIST_PACKED", 43, 43, 3, zzzuVar4);
        zzR = zzzeVar44;
        zzze zzzeVar45 = new zzze("ENUM_LIST_PACKED", 44, 44, 3, zzzuVar9);
        zzS = zzzeVar45;
        zzze zzzeVar46 = new zzze("SFIXED32_LIST_PACKED", 45, 45, 3, zzzuVar4);
        zzT = zzzeVar46;
        zzze zzzeVar47 = new zzze("SFIXED64_LIST_PACKED", 46, 46, 3, zzzuVar3);
        zzU = zzzeVar47;
        zzze zzzeVar48 = new zzze("SINT32_LIST_PACKED", 47, 47, 3, zzzuVar4);
        zzV = zzzeVar48;
        zzze zzzeVar49 = new zzze("SINT64_LIST_PACKED", 48, 48, 3, zzzuVar3);
        zzW = zzzeVar49;
        zzze zzzeVar50 = new zzze("GROUP_LIST", 49, 49, 2, zzzuVar7);
        zzX = zzzeVar50;
        zzze zzzeVar51 = new zzze("MAP", 50, 50, 4, zzzu.zza);
        zzY = zzzeVar51;
        zzaa = new zzze[]{zzzeVar, zzzeVar2, zzzeVar3, zzzeVar4, zzzeVar5, zzzeVar6, zzzeVar7, zzzeVar8, zzzeVar9, zzzeVar10, zzzeVar11, zzzeVar12, zzzeVar13, zzzeVar14, zzzeVar15, zzzeVar16, zzzeVar17, zzzeVar18, zzzeVar19, zzzeVar20, zzzeVar21, zzzeVar22, zzzeVar23, zzzeVar24, zzzeVar25, zzzeVar26, zzzeVar27, zzzeVar28, zzzeVar29, zzzeVar30, zzzeVar31, zzzeVar32, zzzeVar33, zzzeVar34, zzzeVar35, zzzeVar36, zzzeVar37, zzzeVar38, zzzeVar39, zzzeVar40, zzzeVar41, zzzeVar42, zzzeVar43, zzzeVar44, zzzeVar45, zzzeVar46, zzzeVar47, zzzeVar48, zzzeVar49, zzzeVar50, zzzeVar51};
        zzze[] values = values();
        zzZ = new zzze[values.length];
        for (zzze zzzeVar52 : values) {
            zzZ[zzzeVar52.zzac] = zzzeVar52;
        }
    }

    private zzze(String str, int i10, int i11, int i12, zzzu zzzuVar) {
        this.zzac = i11;
        this.zzab = zzzuVar;
        zzzu zzzuVar2 = zzzu.zza;
        int i13 = i12 - 1;
        if (i13 == 1) {
            this.zzad = zzzuVar.zza();
        } else if (i13 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzzuVar.zza();
        }
        if (i12 == 1) {
            zzzuVar.ordinal();
        }
    }

    public static zzze[] values() {
        return (zzze[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
