package cn.org.rapid_framework.jdbc.sqlgenerator.metadata;

public class Column {

	private String sqlName;
	private String propertyName;
	private boolean isPrimaryKey;

	public Column(String sqlName, String propertyName) {
		this(sqlName,propertyName,false);
	}

	public Column(String sqlName, String propertyName,boolean isPrimaryKey) {
		this.sqlName = sqlName;
		this.propertyName = propertyName;
		this.isPrimaryKey = isPrimaryKey;
	}

	public String getSqlName() {
		return sqlName;
	}
	public void setSqlName(String sqlName) {
		this.sqlName = sqlName;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public boolean isPrimaryKey() {
		return isPrimaryKey;
	}
	public void setPrimaryKey(boolean isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}

	public String toString() {
		return String.format("sqlName:%s propertyName:%s isPrimaryKey:%s",sqlName,propertyName,isPrimaryKey);
	}


}
