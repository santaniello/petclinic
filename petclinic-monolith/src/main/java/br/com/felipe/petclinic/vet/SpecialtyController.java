/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.felipe.petclinic.vet;
import br.com.felipe.petclinic.vet.dto.SpecialtyDTO;
import br.com.felipe.petclinic.vet.dto.SpecialtySaveRequestDTO;
import br.com.felipe.petclinic.vet.entity.SpecialtyEntity;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/specialties")
final class SpecialtyController {
    private SpecialtyService service;
    @PostMapping
    public SpecialtyDTO save(@RequestBody SpecialtySaveRequestDTO dto){
        return service.create(dto);
    }

    @GetMapping
    public Page<SpecialtyEntity> findAll(@RequestParam(defaultValue = "1") int page){
        return service.findAll(page);
    }
}
