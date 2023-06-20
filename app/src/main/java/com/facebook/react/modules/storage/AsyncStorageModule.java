package com.facebook.react.modules.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

@o6.a(name = AsyncStorageModule.NAME)
/* loaded from: classes.dex */
public final class AsyncStorageModule extends NativeAsyncSQLiteDBStorageSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "AsyncSQLiteDBStorage";
    private final g executor;
    private com.facebook.react.modules.storage.c mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* loaded from: classes.dex */
    class a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f15623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f15624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f15623a = callback;
            this.f15624b = readableArray;
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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.AsyncStorageModule.a.doInBackgroundGuarded(java.lang.Void[]):void");
        }
    }

    /* loaded from: classes.dex */
    class b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f15626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f15627b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f15626a = callback;
            this.f15627b = readableArray;
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
                        for (int i10 = 0; i10 < this.f15627b.size(); i10++) {
                            if (this.f15627b.getArray(i10).size() != 2) {
                                WritableMap d10 = com.facebook.react.modules.storage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e10) {
                                    z3.a.H("ReactNative", e10.getMessage(), e10);
                                    if (d10 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e10.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f15627b.getArray(i10).getString(0) == null) {
                                WritableMap c10 = com.facebook.react.modules.storage.b.c(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e11) {
                                    z3.a.H("ReactNative", e11.getMessage(), e11);
                                    if (c10 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e11.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f15627b.getArray(i10).getString(1) == null) {
                                WritableMap d11 = com.facebook.react.modules.storage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e12) {
                                    z3.a.H("ReactNative", e12.getMessage(), e12);
                                    if (d11 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e12.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                compileStatement.clearBindings();
                                compileStatement.bindString(1, this.f15627b.getArray(i10).getString(0));
                                compileStatement.bindString(2, this.f15627b.getArray(i10).getString(1));
                                compileStatement.execute();
                            }
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e13) {
                            z3.a.H("ReactNative", e13.getMessage(), e13);
                            writableMap = com.facebook.react.modules.storage.b.b(null, e13.getMessage());
                        }
                    } catch (Exception e14) {
                        z3.a.H("ReactNative", e14.getMessage(), e14);
                        WritableMap b10 = com.facebook.react.modules.storage.b.b(null, e14.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e15) {
                            z3.a.H("ReactNative", e15.getMessage(), e15);
                            if (b10 == null) {
                                writableMap = com.facebook.react.modules.storage.b.b(null, e15.getMessage());
                            }
                        }
                        writableMap = b10;
                    }
                    if (writableMap != null) {
                        this.f15626a.invoke(writableMap);
                        return;
                    } else {
                        this.f15626a.invoke(new Object[0]);
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                    } catch (Exception e16) {
                        z3.a.H("ReactNative", e16.getMessage(), e16);
                        com.facebook.react.modules.storage.b.b(null, e16.getMessage());
                    }
                    throw th;
                }
            }
            this.f15626a.invoke(com.facebook.react.modules.storage.b.a(null));
        }
    }

    /* loaded from: classes.dex */
    class c extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f15629a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f15630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f15629a = callback;
            this.f15630b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            try {
                if (AsyncStorageModule.this.ensureDatabase()) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().beginTransaction();
                        for (int i10 = 0; i10 < this.f15630b.size(); i10 += 999) {
                            int min = Math.min(this.f15630b.size() - i10, 999);
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().delete("catalystLocalStorage", com.facebook.react.modules.storage.a.a(min), com.facebook.react.modules.storage.a.b(this.f15630b, i10, min));
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e10) {
                            z3.a.H("ReactNative", e10.getMessage(), e10);
                            writableMap = com.facebook.react.modules.storage.b.b(null, e10.getMessage());
                        }
                    } catch (Exception e11) {
                        z3.a.H("ReactNative", e11.getMessage(), e11);
                        WritableMap b10 = com.facebook.react.modules.storage.b.b(null, e11.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e12) {
                            z3.a.H("ReactNative", e12.getMessage(), e12);
                            if (b10 == null) {
                                writableMap = com.facebook.react.modules.storage.b.b(null, e12.getMessage());
                            }
                        }
                        writableMap = b10;
                    }
                    if (writableMap != null) {
                        this.f15629a.invoke(writableMap);
                        return;
                    } else {
                        this.f15629a.invoke(new Object[0]);
                        return;
                    }
                }
                this.f15629a.invoke(com.facebook.react.modules.storage.b.a(null));
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                } catch (Exception e13) {
                    z3.a.H("ReactNative", e13.getMessage(), e13);
                    com.facebook.react.modules.storage.b.b(null, e13.getMessage());
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f15632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f15633b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f15632a = callback;
            this.f15633b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            try {
                if (AsyncStorageModule.this.ensureDatabase()) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.l().beginTransaction();
                        for (int i10 = 0; i10 < this.f15633b.size(); i10++) {
                            if (this.f15633b.getArray(i10).size() != 2) {
                                WritableMap d10 = com.facebook.react.modules.storage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e10) {
                                    z3.a.H("ReactNative", e10.getMessage(), e10);
                                    if (d10 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e10.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f15633b.getArray(i10).getString(0) == null) {
                                WritableMap c10 = com.facebook.react.modules.storage.b.c(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e11) {
                                    z3.a.H("ReactNative", e11.getMessage(), e11);
                                    if (c10 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e11.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f15633b.getArray(i10).getString(1) == null) {
                                WritableMap d11 = com.facebook.react.modules.storage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e12) {
                                    z3.a.H("ReactNative", e12.getMessage(), e12);
                                    if (d11 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e12.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (!com.facebook.react.modules.storage.a.e(AsyncStorageModule.this.mReactDatabaseSupplier.l(), this.f15633b.getArray(i10).getString(0), this.f15633b.getArray(i10).getString(1))) {
                                WritableMap a10 = com.facebook.react.modules.storage.b.a(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                                    return;
                                } catch (Exception e13) {
                                    z3.a.H("ReactNative", e13.getMessage(), e13);
                                    if (a10 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e13.getMessage());
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
                            writableMap = com.facebook.react.modules.storage.b.b(null, e14.getMessage());
                        }
                    } catch (Exception e15) {
                        z3.a.H("ReactNative", e15.getMessage(), e15);
                        WritableMap b10 = com.facebook.react.modules.storage.b.b(null, e15.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                        } catch (Exception e16) {
                            z3.a.H("ReactNative", e16.getMessage(), e16);
                            if (b10 == null) {
                                writableMap = com.facebook.react.modules.storage.b.b(null, e16.getMessage());
                            }
                        }
                        writableMap = b10;
                    }
                    if (writableMap != null) {
                        this.f15632a.invoke(writableMap);
                        return;
                    } else {
                        this.f15632a.invoke(new Object[0]);
                        return;
                    }
                }
                this.f15632a.invoke(com.facebook.react.modules.storage.b.a(null));
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.l().endTransaction();
                } catch (Exception e17) {
                    z3.a.H("ReactNative", e17.getMessage(), e17);
                    com.facebook.react.modules.storage.b.b(null, e17.getMessage());
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f15635a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f15635a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (AsyncStorageModule.this.mReactDatabaseSupplier.h()) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.a();
                    this.f15635a.invoke(new Object[0]);
                    return;
                } catch (Exception e10) {
                    z3.a.H("ReactNative", e10.getMessage(), e10);
                    this.f15635a.invoke(com.facebook.react.modules.storage.b.b(null, e10.getMessage()));
                    return;
                }
            }
            this.f15635a.invoke(com.facebook.react.modules.storage.b.a(null));
        }
    }

    /* loaded from: classes.dex */
    class f extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f15637a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f15637a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f15637a.invoke(com.facebook.react.modules.storage.b.a(null), null);
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
                        this.f15637a.invoke(null, createArray);
                    }
                    query.close();
                    this.f15637a.invoke(null, createArray);
                } catch (Exception e10) {
                    z3.a.H("ReactNative", e10.getMessage(), e10);
                    this.f15637a.invoke(com.facebook.react.modules.storage.b.b(null, e10.getMessage()), null);
                    query.close();
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    private class g implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<Runnable> f15639a = new ArrayDeque<>();

        /* renamed from: b  reason: collision with root package name */
        private Runnable f15640b;

        /* renamed from: c  reason: collision with root package name */
        private final Executor f15641c;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f15642a;

            a(Runnable runnable) {
                this.f15642a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f15642a.run();
                } finally {
                    g.this.a();
                }
            }
        }

        g(AsyncStorageModule asyncStorageModule, Executor executor) {
            this.f15641c = executor;
        }

        synchronized void a() {
            Runnable poll = this.f15639a.poll();
            this.f15640b = poll;
            if (poll != null) {
                this.f15641c.execute(poll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f15639a.offer(new a(runnable));
            if (this.f15640b == null) {
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

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.b();
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
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

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(com.facebook.react.modules.storage.b.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(com.facebook.react.modules.storage.b.c(null));
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(com.facebook.react.modules.storage.b.c(null));
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new g(this, executor);
        this.mReactDatabaseSupplier = com.facebook.react.modules.storage.c.q(reactApplicationContext);
    }
}
