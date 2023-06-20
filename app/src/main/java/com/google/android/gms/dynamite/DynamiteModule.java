package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class DynamiteModule {
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static zzq zzj;
    private static zzr zzk;
    private final Context zzi;
    private static final ThreadLocal<zzn> zzf = new ThreadLocal<>();
    private static final ThreadLocal<Long> zzg = new zzd();
    private static final VersionPolicy.IVersions zzh = new zze();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @DynamiteApi
    /* loaded from: classes2.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* loaded from: classes2.dex */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        /* loaded from: classes2.dex */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z10) throws LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        /* loaded from: classes2.dex */
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion = 0;
            @KeepForSdk
            public int remoteVersion = 0;
            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzi = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".");
            sb2.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
                sb3.append("Module descriptor id '");
                sb3.append(valueOf);
                sb3.append("' didn't match expected id '");
                sb3.append(str);
                sb3.append("'");
                Log.e("DynamiteModule", sb3.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        Boolean bool;
        IObjectWrapper zzh2;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        Boolean valueOf;
        IObjectWrapper zze2;
        ThreadLocal<zzn> threadLocal = zzf;
        zzn zznVar = threadLocal.get();
        zzn zznVar2 = new zzn(null);
        threadLocal.set(zznVar2);
        ThreadLocal<Long> threadLocal2 = zzg;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzh);
            int i10 = selectModule.localVersion;
            int i11 = selectModule.remoteVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i10);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i11);
            Log.i("DynamiteModule", sb2.toString());
            int i12 = selectModule.selection;
            if (i12 != 0) {
                if (i12 == -1) {
                    if (selectModule.localVersion != 0) {
                        i12 = -1;
                    }
                }
                if (i12 != 1 || selectModule.remoteVersion != 0) {
                    if (i12 == -1) {
                        DynamiteModule zzc2 = zzc(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar);
                        return zzc2;
                    } else if (i12 == 1) {
                        try {
                            int i13 = selectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    bool = zzb;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i13);
                                        Log.i("DynamiteModule", sb3.toString());
                                        synchronized (DynamiteModule.class) {
                                            zzrVar = zzk;
                                        }
                                        if (zzrVar != null) {
                                            zzn zznVar3 = threadLocal.get();
                                            if (zznVar3 != null && zznVar3.zza != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor2 = zznVar3.zza;
                                                ObjectWrapper.wrap(null);
                                                synchronized (DynamiteModule.class) {
                                                    valueOf = Boolean.valueOf(zze >= 2);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    zze2 = zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i13, ObjectWrapper.wrap(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    zze2 = zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i13, ObjectWrapper.wrap(cursor2));
                                                }
                                                Context context2 = (Context) ObjectWrapper.unwrap(zze2);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new LoadingException("Failed to get module context", null);
                                                }
                                            } else {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str);
                                        sb4.append(", version >= ");
                                        sb4.append(i13);
                                        Log.i("DynamiteModule", sb4.toString());
                                        zzq zzf2 = zzf(context);
                                        if (zzf2 != null) {
                                            int zze3 = zzf2.zze();
                                            if (zze3 >= 3) {
                                                zzn zznVar4 = threadLocal.get();
                                                if (zznVar4 != null) {
                                                    zzh2 = zzf2.zzi(ObjectWrapper.wrap(context), str, i13, ObjectWrapper.wrap(zznVar4.zza));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                            } else if (zze3 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                zzh2 = zzf2.zzj(ObjectWrapper.wrap(context), str, i13);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                zzh2 = zzf2.zzh(ObjectWrapper.wrap(context), str, i13);
                                            }
                                            if (ObjectWrapper.unwrap(zzh2) != null) {
                                                dynamiteModule = new DynamiteModule((Context) ObjectWrapper.unwrap(zzh2));
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = zznVar2.zza;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(zznVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e10) {
                                throw new LoadingException("Failed to load remote module.", e10, null);
                            } catch (LoadingException e11) {
                                throw e11;
                            } catch (Throwable th) {
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new LoadingException("Failed to load remote module.", th, null);
                            }
                        } catch (LoadingException e12) {
                            String valueOf2 = String.valueOf(e12.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                            int i14 = selectModule.localVersion;
                            if (i14 != 0 && versionPolicy.selectModule(context, str, new zzo(i14, 0)).selection == -1) {
                                DynamiteModule zzc3 = zzc(context, str);
                                if (longValue == 0) {
                                    zzg.remove();
                                } else {
                                    zzg.set(Long.valueOf(longValue));
                                }
                                Cursor cursor4 = zznVar2.zza;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                zzf.set(zznVar);
                                return zzc3;
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e12, null);
                        }
                    } else {
                        StringBuilder sb5 = new StringBuilder(47);
                        sb5.append("VersionPolicy returned invalid code:");
                        sb5.append(i12);
                        throw new LoadingException(sb5.toString(), null);
                    }
                }
            }
            int i15 = selectModule.localVersion;
            int i16 = selectModule.remoteVersion;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 92);
            sb6.append("No acceptable module ");
            sb6.append(str);
            sb6.append(" found. Local version is ");
            sb6.append(i15);
            sb6.append(" and remote version is ");
            sb6.append(i16);
            sb6.append(".");
            throw new LoadingException(sb6.toString(), null);
        } catch (Throwable th2) {
            if (longValue == 0) {
                zzg.remove();
            } else {
                zzg.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = zznVar2.zza;
            if (cursor5 != null) {
                cursor5.close();
            }
            zzf.set(zznVar);
            throw th2;
        }
    }

    public static int zza(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th;
        RemoteException e10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        String obj = e11.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    zzd(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else {
                            if (!zzd) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int zzb2 = zzb(context, str, z10);
                                        String str2 = zzc;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader zza2 = zzb.zza();
                                            if (zza2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = zzc;
                                                    Preconditions.checkNotNull(str3);
                                                    zza2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = zzc;
                                                    Preconditions.checkNotNull(str4);
                                                    zza2 = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            zzd(zza2);
                                            declaredField.set(null, zza2);
                                            zzb = bool2;
                                            return zzb2;
                                        }
                                        return zzb2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        zzb = bool;
                    }
                }
                boolean booleanValue = bool.booleanValue();
                int i10 = 0;
                if (booleanValue) {
                    try {
                        return zzb(context, str, z10);
                    } catch (LoadingException e12) {
                        String valueOf = String.valueOf(e12.getMessage());
                        Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                zzq zzf2 = zzf(context);
                try {
                    if (zzf2 != null) {
                        try {
                            int zze2 = zzf2.zze();
                            if (zze2 >= 3) {
                                zzn zznVar = zzf.get();
                                if (zznVar != null && (cursor = zznVar.zza) != null) {
                                    i10 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzf2.zzk(ObjectWrapper.wrap(context), str, z10, zzg.get().longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i11 = cursor3.getInt(0);
                                                if (i11 <= 0 || !zze(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            cursor2 = cursor3;
                                            String valueOf2 = String.valueOf(e10.getMessage());
                                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i10;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (zze2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = zzf2.zzg(ObjectWrapper.wrap(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = zzf2.zzf(ObjectWrapper.wrap(context), str, z10);
                            }
                        } catch (RemoteException e14) {
                            e10 = e14;
                        }
                    }
                    return i10;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.zzg     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r12.<init>()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            if (r10 == 0) goto La0
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r11 == 0) goto La0
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.zzc = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.zze = r2     // Catch: java.lang.Throwable -> L8b
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.zzd = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = zze(r10)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r1 == 0) goto L8e
            r10 = r0
            goto L8e
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L8e:
            if (r11 != 0) goto L96
            if (r10 == 0) goto L95
            r10.close()
        L95:
            return r12
        L96:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L9e:
            r11 = move-exception
            goto Lb5
        La0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        Laf:
            r10 = move-exception
            r11 = r10
            goto Lc4
        Lb2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> Lc2
            if (r12 == 0) goto Lba
            throw r11     // Catch: java.lang.Throwable -> Lc2
        Lba:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch: java.lang.Throwable -> Lc2
            throw r12     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r11 = move-exception
            r0 = r10
        Lc4:
            if (r0 == 0) goto Lc9
            r0.close()
        Lc9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            zzk = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10, null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = zzf.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static zzq zzf(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzj;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzj = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    @KeepForSdk
    public Context getModuleContext() {
        return this.zzi;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzi.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e10, null);
        }
    }
}
