package com.meeting.model;
import java.util.ArrayList;
import java.util.List;
public class SignLogExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public SignLogExample() {
		oredCriteria = new ArrayList<>();
	}
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	public String getOrderByClause() {
		return orderByClause;
	}
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}
	public boolean isDistinct() {
		return distinct;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setPageRows(int pageRows) {
		this.pageRows = pageRows;
	}
	public int getPageRows() {
		return pageRows;
	}
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;
		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}
		public boolean isValid() {
			return criteria.size() > 0;
		}
		public List<Criterion> getAllCriteria() {
			return criteria;
		}
		public List<Criterion> getCriteria() {
			return criteria;
		}
		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}
		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}
		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}
		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}
		public Criteria andIdIsNotNull(){
			addCriterion("id is not null");
			return (Criteria) this;
		}
		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "Id");
			return (Criteria) this;
		}
		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}
		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}
		public Criteria andIdLike(Integer value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotLike(Integer value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}
		public Criteria andMeetingIdIsNull() {
			addCriterion("meeting_id is null");
			return (Criteria) this;
		}
		public Criteria andMeetingIdIsNotNull(){
			addCriterion("meeting_id is not null");
			return (Criteria) this;
		}
		public Criteria andMeetingIdEqualTo(Integer value) {
			addCriterion("meeting_id =", value, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdNotEqualTo(Integer value) {
			addCriterion("meeting_id <>", value, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdGreaterThan(Integer value) {
			addCriterion("meeting_id >", value, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("meeting_id >=", value, "MeetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdLessThan(Integer value) {
			addCriterion("meeting_id <", value, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdLessThanOrEqualTo(Integer value) {
			addCriterion("meeting_id <=", value, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdIn(List<Integer> values) {
			addCriterion("meeting_id in", values, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdNotIn(List<Integer> values) {
			addCriterion("meeting_id not in", values, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdBetween(Integer value1, Integer value2) {
			addCriterion("meeting_id between", value1, value2, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdNotBetween(Integer value1, Integer value2) {
			addCriterion("meeting_id not between", value1, value2, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdLike(Integer value) {
			addCriterion("meeting_id like", value, "meetingId");
			return (Criteria) this;
		}
		public Criteria andMeetingIdNotLike(Integer value) {
			addCriterion("meeting_id not like", value, "meetingId");
			return (Criteria) this;
		}
		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}
		public Criteria andUserIdIsNotNull(){
			addCriterion("user_id is not null");
			return (Criteria) this;
		}
		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "UserId");
			return (Criteria) this;
		}
		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdLike(Integer value) {
			addCriterion("user_id like", value, "userId");
			return (Criteria) this;
		}
		public Criteria andUserIdNotLike(Integer value) {
			addCriterion("user_id not like", value, "userId");
			return (Criteria) this;
		}
		public Criteria andSignTimeIsNull() {
			addCriterion("sign_time is null");
			return (Criteria) this;
		}
		public Criteria andSignTimeIsNotNull(){
			addCriterion("sign_time is not null");
			return (Criteria) this;
		}
		public Criteria andSignTimeEqualTo(String value) {
			addCriterion("sign_time =", value, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeNotEqualTo(String value) {
			addCriterion("sign_time <>", value, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeGreaterThan(String value) {
			addCriterion("sign_time >", value, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeGreaterThanOrEqualTo(String value) {
			addCriterion("sign_time >=", value, "SignTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeLessThan(String value) {
			addCriterion("sign_time <", value, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeLessThanOrEqualTo(String value) {
			addCriterion("sign_time <=", value, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeIn(List<String> values) {
			addCriterion("sign_time in", values, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeNotIn(List<String> values) {
			addCriterion("sign_time not in", values, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeBetween(String value1, String value2) {
			addCriterion("sign_time between", value1, value2, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeNotBetween(String value1, String value2) {
			addCriterion("sign_time not between", value1, value2, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeLike(String value) {
			addCriterion("sign_time like", value, "signTime");
			return (Criteria) this;
		}
		public Criteria andSignTimeNotLike(String value) {
			addCriterion("sign_time not like", value, "signTime");
			return (Criteria) this;
		}
		public Criteria andMemberIdIsNull() {
			addCriterion("member_id is null");
			return (Criteria) this;
		}
		public Criteria andMemberIdIsNotNull(){
			addCriterion("member_id is not null");
			return (Criteria) this;
		}
		public Criteria andMemberIdEqualTo(Integer value) {
			addCriterion("member_id =", value, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdNotEqualTo(Integer value) {
			addCriterion("member_id <>", value, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdGreaterThan(Integer value) {
			addCriterion("member_id >", value, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("member_id >=", value, "MemberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdLessThan(Integer value) {
			addCriterion("member_id <", value, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
			addCriterion("member_id <=", value, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdIn(List<Integer> values) {
			addCriterion("member_id in", values, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdNotIn(List<Integer> values) {
			addCriterion("member_id not in", values, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdBetween(Integer value1, Integer value2) {
			addCriterion("member_id between", value1, value2, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
			addCriterion("member_id not between", value1, value2, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdLike(Integer value) {
			addCriterion("member_id like", value, "memberId");
			return (Criteria) this;
		}
		public Criteria andMemberIdNotLike(Integer value) {
			addCriterion("member_id not like", value, "memberId");
			return (Criteria) this;
		}
	}
	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;
		public String getCondition() {
			return condition;
		}
		public Object getValue() {
			return value;
		}
		public Object getSecondValue() {
			return secondValue;
		}
		public boolean isNoValue() {
			return noValue;
		}
		public boolean isSingleValue() {
			return singleValue;
		}
		public boolean isBetweenValue() {
			return betweenValue;
		}
		public boolean isListValue() {
			return listValue;
		}
		public String getTypeHandler() {
			return typeHandler;
		}
		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}
		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}
		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}
		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}
		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}