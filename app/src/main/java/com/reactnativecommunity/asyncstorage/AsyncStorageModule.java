package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

@o6.a(name = AsyncStorageModule.NAME)
/* loaded from: classes3.dex */
public final class AsyncStorageModule extends ReactContextBaseJavaModule {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNC_AsyncSQLiteDBStorage";
    private final g executor;
    private com.reactnativecommunity.asyncstorage.e mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* loaded from: classes3.dex */
    class a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f28282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f28283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f28282a = callback;
            this.f28283b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1 A[LOOP:3: B:21:0x00bb->B:23:0x00c1, LOOP_END] */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void doInBackgroundGuarded(java.lang.Void... r20) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.asyncstorage.AsyncStorageModule.a.doInBackgroundGuarded(java.lang.Void[]):void");
        }
    }

    /* loaded from: classes3.dex */
    class b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f28285a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f28286b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f28285a = callback;
            this.f28286b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (AsyncStorageModule.this.ensureDatabase()) {
                SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.l().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
                try {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().beginTransaction();
                        for (int i10 = 0; i10 < this.f28286b.size(); i10++) {
                            if (this.f28286b.getArray(i10).size() != 2) {
                                WritableMap d10 = com.reactnativecommunity.asyncstorage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e10) {
                                    z3.a.H("ReactNative", e10.getMessage(), e10);
                                    if (d10 == null) {
                                        com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f28286b.getArray(i10).getString(0) == null) {
                                WritableMap c10 = com.reactnativecommunity.asyncstorage.b.c(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e11) {
                                    z3.a.H("ReactNative", e11.getMessage(), e11);
                                    if (c10 == null) {
                                        com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f28286b.getArray(i10).getString(1) == null) {
                                WritableMap d11 = com.reactnativecommunity.asyncstorage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e12) {
                                    z3.a.H("ReactNative", e12.getMessage(), e12);
                                    if (d11 == null) {
                                        com.reactnativecommunity.asyncstorage.b.b(null, e12.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                compileStatement.clearBindings();
                                compileStatement.bindString(1, this.f28286b.getArray(i10).getString(0));
                                compileStatement.bindString(2, this.f28286b.getArray(i10).getString(1));
                                compileStatement.execute();
                            }
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e13) {
                            z3.a.H("ReactNative", e13.getMessage(), e13);
                            writableMap = com.reactnativecommunity.asyncstorage.b.b(null, e13.getMessage());
                        }
                    } catch (Exception e14) {
                        z3.a.H("ReactNative", e14.getMessage(), e14);
                        WritableMap b10 = com.reactnativecommunity.asyncstorage.b.b(null, e14.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e15) {
                            z3.a.H("ReactNative", e15.getMessage(), e15);
                            if (b10 == null) {
                                writableMap = com.reactnativecommunity.asyncstorage.b.b(null, e15.getMessage());
                            }
                        }
                        writableMap = b10;
                    }
                    if (writableMap != null) {
                        this.f28285a.invoke(writableMap);
                        return;
                    } else {
                        this.f28285a.invoke(new Object[0]);
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                    } catch (Exception e16) {
                        z3.a.H("ReactNative", e16.getMessage(), e16);
                        com.reactnativecommunity.asyncstorage.b.b(null, e16.getMessage());
                    }
                    throw th;
                }
            }
            this.f28285a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
        }
    }

    /* loaded from: classes3.dex */
    class c extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f28288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f28289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f28288a = callback;
            this.f28289b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            try {
                if (AsyncStorageModule.this.ensureDatabase()) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().beginTransaction();
                        for (int i10 = 0; i10 < this.f28289b.size(); i10 += 999) {
                            int min = Math.min(this.f28289b.size() - i10, 999);
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().delete("catalystLocalStorage", com.reactnativecommunity.asyncstorage.a.a(min), com.reactnativecommunity.asyncstorage.a.b(this.f28289b, i10, min));
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e10) {
                            z3.a.H("ReactNative", e10.getMessage(), e10);
                            writableMap = com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                        }
                    } catch (Exception e11) {
                        z3.a.H("ReactNative", e11.getMessage(), e11);
                        WritableMap b10 = com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e12) {
                            z3.a.H("ReactNative", e12.getMessage(), e12);
                            if (b10 == null) {
                                writableMap = com.reactnativecommunity.asyncstorage.b.b(null, e12.getMessage());
                            }
                        }
                        writableMap = b10;
                    }
                    if (writableMap != null) {
                        this.f28288a.invoke(writableMap);
                        return;
                    } else {
                        this.f28288a.invoke(new Object[0]);
                        return;
                    }
                }
                this.f28288a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                } catch (Exception e13) {
                    z3.a.H("ReactNative", e13.getMessage(), e13);
                    com.reactnativecommunity.asyncstorage.b.b(null, e13.getMessage());
                }
                throw th;
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f28291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f28292b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f28291a = callback;
            this.f28292b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            try {
                if (AsyncStorageModule.this.ensureDatabase()) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().beginTransaction();
                        for (int i10 = 0; i10 < this.f28292b.size(); i10++) {
                            if (this.f28292b.getArray(i10).size() != 2) {
                                WritableMap d10 = com.reactnativecommunity.asyncstorage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e10) {
                                    z3.a.H("ReactNative", e10.getMessage(), e10);
                                    if (d10 == null) {
                                        com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f28292b.getArray(i10).getString(0) == null) {
                                WritableMap c10 = com.reactnativecommunity.asyncstorage.b.c(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e11) {
                                    z3.a.H("ReactNative", e11.getMessage(), e11);
                                    if (c10 == null) {
                                        com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f28292b.getArray(i10).getString(1) == null) {
                                WritableMap d11 = com.reactnativecommunity.asyncstorage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e12) {
                                    z3.a.H("ReactNative", e12.getMessage(), e12);
                                    if (d11 == null) {
                                        com.reactnativecommunity.asyncstorage.b.b(null, e12.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (!com.reactnativecommunity.asyncstorage.a.e(AsyncStorageModule.this.mReactDatabaseSupplier.l(), this.f28292b.getArray(i10).getString(0), this.f28292b.getArray(i10).getString(1))) {
                                WritableMap a10 = com.reactnativecommunity.asyncstorage.b.a(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e13) {
                                    z3.a.H("ReactNative", e13.getMessage(), e13);
                                    if (a10 == null) {
                                        com.reactnativecommunity.asyncstorage.b.b(null, e13.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e14) {
                            z3.a.H("ReactNative", e14.getMessage(), e14);
                            writableMap = com.reactnativecommunity.asyncstorage.b.b(null, e14.getMessage());
                        }
                    } catch (Exception e15) {
                        z3.a.H("ReactNative", e15.getMessage(), e15);
                        WritableMap b10 = com.reactnativecommunity.asyncstorage.b.b(null, e15.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e16) {
                            z3.a.H("ReactNative", e16.getMessage(), e16);
                            if (b10 == null) {
                                writableMap = com.reactnativecommunity.asyncstorage.b.b(null, e16.getMessage());
                            }
                        }
                        writableMap = b10;
                    }
                    if (writableMap != null) {
                        this.f28291a.invoke(writableMap);
                        return;
                    } else {
                        this.f28291a.invoke(new Object[0]);
                        return;
                    }
                }
                this.f28291a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                } catch (Exception e17) {
                    z3.a.H("ReactNative", e17.getMessage(), e17);
                    com.reactnativecommunity.asyncstorage.b.b(null, e17.getMessage());
                }
                throw th;
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f28294a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f28294a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (AsyncStorageModule.this.mReactDatabaseSupplier.h()) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.a();
                    this.f28294a.invoke(new Object[0]);
                    return;
                } catch (Exception e10) {
                    z3.a.H("ReactNative", e10.getMessage(), e10);
                    this.f28294a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage()));
                    return;
                }
            }
            this.f28294a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
        }
    }

    /* loaded from: classes3.dex */
    class f extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f28296a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f28296a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f28296a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.l().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (query.moveToFirst()) {
                        do {
                            createArray.pushString(query.getString(0));
                        } while (query.moveToNext());
                        query.close();
                        this.f28296a.invoke(null, createArray);
                    }
                    query.close();
                    this.f28296a.invoke(null, createArray);
                } catch (Exception e10) {
                    z3.a.H("ReactNative", e10.getMessage(), e10);
                    this.f28296a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage()), null);
                    query.close();
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    /* loaded from: classes3.dex */
    private class g implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<Runnable> f28298a = new ArrayDeque<>();

        /* renamed from: b  reason: collision with root package name */
        private Runnable f28299b;

        /* renamed from: c  reason: collision with root package name */
        private final Executor f28300c;

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f28301a;

            a(Runnable runnable) {
                this.f28301a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f28301a.run();
                } finally {
                    g.this.a();
                }
            }
        }

        g(AsyncStorageModule asyncStorageModule, Executor executor) {
            this.f28300c = executor;
        }

        synchronized void a() {
            Runnable poll = this.f28298a.poll();
            this.f28299b = poll;
            if (poll != null) {
                this.f28300c.execute(poll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f28298a.offer(new a(runnable));
            if (this.f28299b == null) {
                a();
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.h();
    }

    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.b();
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(com.reactnativecommunity.asyncstorage.b.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new g(this, executor);
        this.mReactDatabaseSupplier = com.reactnativecommunity.asyncstorage.e.q(reactApplicationContext);
    }
}
