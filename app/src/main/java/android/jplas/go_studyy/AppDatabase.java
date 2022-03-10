package android.jplas.go_studyy;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {Contact.class}, version = 1, exportSchema = false)
@TypeConverters({DateTypeConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract ContactDAO getContactDAO();
}
