package kr.Irang.study;

// [0] : 컬렉션 사전학습
// 처음 자바 책 사서 컬렉션 파트 훑어 봤을 때 꽤 어렵네.. 라고 느꼈다면? --> 선수학습이 안되어 있어서 그렇다.
// 선수학습 --> OOP, 추상 클래스, 상속, 인터페이스, 제네릭 등에 대한 학습이 안되어 있으면 컬렉션 공부하기가 어렵다.
// 공부할 양이 제법 많다. 그래서 어지간한 기본서에서는 아예 컬렉션 파트를 다루지 않고, 두꺼운 기본서 정도 되어야 개념과 여러 클래스를 다룬다.
// 본 과정에서도 컬렉션에 대한 개념과 ArrayList 클래스 위주로 진행.

// [1] : Collection Framework 란?
// "수집품"이라는 사전적 의미에서 유추할 수 있듯이 "데이터 값들을 담는 여러 그릇"정도로 이해하면 된다.
// 집 부엌 찬장을 열어보면 종류별로 그릇이 많이 있듯이 어떤 자료구조 데이터를 저장하고 관리할 것인지에 따라서 맞는 그릇을 써야 한다.
// 내가 만들 프로그램의 데이터 처리를 어떻게 할지 그 특징을 잘 파악하여 컬렉션 내 맞는 그릇(클래스)을 잘 골라 써야한다.
// 이러한 것은 파이썬에서도 마찬가지이다. 용도에 맞는 걸 써야 효율적이지 않겠는가?
// 컬렉션 프레임워크는 크게 봤을 때 --> Collection 과 Map 으로 나뉘고 --> 이 둘은 모두 인터페이스(Interface)로 되어 있다.
// Collection 은 또 List 와 Set 으로 나뉘고 --> 이들도 인터페이스 --> 이들을 상속받아 다양한 형태의 배열(그릇 클래스)로 사용된다.

// [2] : Collection
// Collection(인터페이스) --> 상속 --> List 와 Set 으로 구분(인터페이스) --> 상속 --> List 계열 구현 클래스 vs Set 계열 구현 클래스
// List 계열 구현 클래스 --> ArrayList, LinkedList, Vector, Stack
// Set 계열 구현 클래스 --> HashSet, SortedSet, TreeSet

// [3] : List vs Set
// 컬렉션 프레임워크의 핵심 인터페이스들.
// List 인터페이스를 상속하는 클래스들 특징 --> (1)인덱스가 있고, (2)그래서 저장 순서가 유지되고, (3)데이터 중복이 허용.
// Set 인터페이스를 상속하는 클래스들 특징 --> (1)데이터 중복이 허용 안됨.

public class Collection_Framework {
}
