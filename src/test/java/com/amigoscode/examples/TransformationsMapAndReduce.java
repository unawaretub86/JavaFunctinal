package com.amigoscode.examples;

import com.amigoscode.beans.Car;
import com.amigoscode.beans.Person;
import com.amigoscode.beans.PersonDTO;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformationsMapAndReduce {

    @Test
    void yourFirstTransformationWithMap() throws IOException {
        List<Person> people = MockData.getPeople();
        Function<Person, PersonDTO> personToPersonDTO = person ->
            new PersonDTO(
                    person.getId(),
                    person.getFirstName(),
                    person.getAge());

        List<PersonDTO> dtos = people.stream()
                .filter(person -> person.getAge().equals(20))
                .map(personToPersonDTO).collect(Collectors.toList());
//        assertThat(people.size()).isEqualTo(dtos.size());
        dtos.forEach(System.out::println);
    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() throws IOException {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void reduce() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    }
}

