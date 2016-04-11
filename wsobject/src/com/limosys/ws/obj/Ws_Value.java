package com.limosys.ws.obj;

public class Ws_Value {
	public static final Ws_Value EMPTY_VALUE = new Ws_Value(null, ValueType.UNKNOWN);

	private int intValue;
	private double doubleValue;
	private boolean booleanValue;
	private String stringValue = "";

	private final ValueType type;

	private Ws_Value(Object o, ValueType type) {
		switch (type) {
			case BOOLEAN:
				booleanValue = ((Boolean) o).booleanValue();
				break;
			case DOUBLE:
				doubleValue = ((Double) o).doubleValue();
				break;
			case INTEGER:
				intValue = ((Integer) o).intValue();
				break;
			case STRING:
				stringValue = ((String) o);
				break;
			case UNKNOWN:
				break;
			default:
				break;
		}
		this.type = type;
	}

	public static Ws_Value fromInt(int i) {
		return new Ws_Value(Integer.valueOf(i), ValueType.INTEGER);
	}

	public static Ws_Value fromDouble(double d) {
		return new Ws_Value(Double.valueOf(d), ValueType.DOUBLE);
	}

	public static Ws_Value fromString(String s) {
		return new Ws_Value(s, ValueType.STRING);
	}

	public static Ws_Value fromBoolean(boolean b) {
		return new Ws_Value(Boolean.valueOf(b), ValueType.BOOLEAN);
	}

	public int getInt() {
		return intValue;
	}

	public double getDouble() {
		return doubleValue;
	}

	public String getString() {
		return stringValue;
	}

	public boolean getBoolean() {
		return booleanValue;
	}

	public ValueType getType() {
		return type;
	}

	@Override
	public String toString() {
		switch (type) {
			case BOOLEAN:
				return String.valueOf(booleanValue);
			case DOUBLE:
				return String.valueOf(doubleValue);
			case INTEGER:
				return String.valueOf(intValue);
			case STRING:
				return stringValue;
			case UNKNOWN:
				return null;
			default:
				return null;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Ws_Value) {
			Ws_Value rsv = (Ws_Value) o;
			if (rsv.getType() == getType()) {
					switch (getType()) {
						case BOOLEAN:
							return rsv.getBoolean() == getBoolean();
						case DOUBLE:
							return rsv.getDouble() == getDouble();
						case INTEGER:
							return rsv.getInt() == getInt();
						case STRING:
							return rsv.getString().equals(getString());
						case UNKNOWN:
							return true;
					}
			} else
					return false;
		}
		return false;
	}

	public enum ValueType {
		INTEGER,
		DOUBLE,
		STRING,
		BOOLEAN,
		UNKNOWN
	}
}
