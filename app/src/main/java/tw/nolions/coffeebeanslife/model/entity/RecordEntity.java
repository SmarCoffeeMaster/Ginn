package tw.nolions.coffeebeanslife.model.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ColumnInfo;

@Entity(tableName = "records")
public class RecordEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "record")
    public String record;

    @ColumnInfo(name = "runTime")
    public int runTime;

    @ColumnInfo(name = "create_at")
    public Long create_at;

    public String test() {
        return "aa11";
    }
}
